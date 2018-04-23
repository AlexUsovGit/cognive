package com.cognive.app.base.servlet;

import java.io.IOException;
import java.net.URI;
import java.security.SecureRandom;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.cognive.app.base.rest.model.messages.StatusMessage;
import com.cognive.core.serialization.DefaultJsonObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DefaultErrorServlet extends HttpServlet {

	private static final long serialVersionUID = 1229723663927979294L;

	private static final Logger logger = LoggerFactory.getLogger(DefaultErrorServlet.class);
	
	private ObjectMapper objectMapper;

    @Override
    public void init() throws ServletException {
        objectMapper = new DefaultJsonObjectMapper();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	RequestAttributes requestAttributes = new ServletRequestAttributes(req);
    	for (String attrName : requestAttributes.getAttributeNames(RequestAttributes.SCOPE_REQUEST)) {
    		if (attrName.contains( "error" )) {
    			logger.error("\t{}: {}", attrName, requestAttributes.getAttribute(attrName, RequestAttributes.SCOPE_REQUEST));
    		}
    	}
    	
    	String externalUserMessage = HttpStatus.INTERNAL_SERVER_ERROR.toString();
		if(logger.isDebugEnabled()) {
			StringBuilder sb = new StringBuilder();
			sb.append( requestAttributes.getAttribute("javax.servlet.error.request_uri", RequestAttributes.SCOPE_REQUEST) );
			sb.append( ' ' );
			sb.append( requestAttributes.getAttribute("javax.servlet.error.status_code", RequestAttributes.SCOPE_REQUEST) );
			sb.append( ' ' );
			sb.append( requestAttributes.getAttribute("javax.servlet.error.message", RequestAttributes.SCOPE_REQUEST) );
			externalUserMessage = sb.toString();
		}
		
		int statusCode = HttpStatus.INTERNAL_SERVER_ERROR.value();
		try {
			statusCode = Integer.parseInt( requestAttributes.getAttribute("javax.servlet.error.status_code", RequestAttributes.SCOPE_REQUEST).toString() );
		} catch (Exception e) {
			// ignore
		}

		if (HttpStatus.NOT_FOUND.value() == statusCode) {
			// redirect to app root
//			String appUrl = getAppUrl(req);
//			resp.addHeader("Location", appUrl);
//			LOG.info("Hub didn't find requested URL. Redirect: set HTTP header Location: " + appUrl);
//			resp.setStatus(HttpServletResponse.SC_TEMPORARY_REDIRECT);
			
			// forward to app root
			String appUrl = req.getContextPath();
			// String appUrl = "/index.html?_=" + getRandomValue();
			logger.info("Hub didn't find requested URL. Forward to " + appUrl );
			getServletContext().getRequestDispatcher(appUrl).forward(req, resp);
		} else {
	        StatusMessage statusMessage = StatusMessage.getBuilder().withIsError(true)
	                .withStatus(statusCode)
	                .withMessage(externalUserMessage).build();
	        objectMapper.writerWithDefaultPrettyPrinter().writeValue(resp.getOutputStream(), statusMessage);
		}
    }
    
	protected String getRandomValue() {
		SecureRandom random = new SecureRandom();
		byte sessBytes[] = new byte[32];
		random.nextBytes(sessBytes);
		return new String(sessBytes);
	}

	protected String getAppUrl(HttpServletRequest req) {
		return URI.create(req.getRequestURL().toString()).resolve(req.getContextPath()).toString();
	}
	
}
