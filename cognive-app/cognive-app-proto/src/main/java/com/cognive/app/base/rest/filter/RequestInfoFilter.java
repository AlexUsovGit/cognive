package com.cognive.app.base.rest.filter;

import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.cognive.app.base.rest.model.RequestInfo;

public class RequestInfoFilter implements HandlerInterceptor {

	private static final Logger logger = LoggerFactory.getLogger(RequestInfoFilter.class);
	
    @Override
    public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler) throws Exception {

    	// grab info and put into request scope 
    	
    	RequestInfo info = new RequestInfo();
    	info.setDate(new Date());
    	info.setUrl(request.getRequestURI());
    	info.setMethod(request.getMethod());
    	info.setRequestKey(UUID.randomUUID().toString());
    	
    	// TODO: save in context
    	
        return true;
    }

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		// put end date or log
		// HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
    
}
