package com.cognive.app.base.rest.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cognive.app.base.exception.RestCogniveRtException;
import com.cognive.app.base.rest.model.messages.StatusMessage;

@RestControllerAdvice 
public class RestExceptionMapper extends ResponseEntityExceptionHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(RestExceptionMapper.class);

    @ExceptionHandler(value = { RestCogniveRtException.class })
    protected ResponseEntity<Object> handleConflict(RestCogniveRtException ex, WebRequest request) {
    	StatusMessage body = StatusMessage.getBuilder()
    			.withMessage(ex.getMessage())
    			.withStatus(ex.getCode())
    			.build();
    	
        return handleExceptionInternal(ex, body, 
          new HttpHeaders(), ex.getCode(), request);
    }	
    
    @ExceptionHandler(value = { RuntimeException.class })
    protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {
    	StatusMessage body = StatusMessage.getBuilder()
    			.withMessage(ex.getMessage())
    			.withStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    			.build();
    	
        return handleExceptionInternal(ex, body, 
          new HttpHeaders(), body.getStatus(), request);
    }
    
}