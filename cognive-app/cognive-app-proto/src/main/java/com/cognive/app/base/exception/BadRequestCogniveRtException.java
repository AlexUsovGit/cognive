package com.cognive.app.base.exception;

import org.springframework.http.HttpStatus;

import com.cognive.core.model.RequestInfo;

public class BadRequestCogniveRtException extends RestCogniveRtException {

	private static final long serialVersionUID = 4019541438625800479L;

	public BadRequestCogniveRtException() {
		super();
	}

	public BadRequestCogniveRtException(String message) {
		super(message);
	}

	public BadRequestCogniveRtException(String message, Throwable cause) {
		super(message, cause);
	}

	public BadRequestCogniveRtException(String message, Throwable cause, RequestInfo requestInfo) {
		super(message, cause, requestInfo);
	}
	
	protected HttpStatus getDefaultHttpStatus() {
		return HttpStatus.BAD_REQUEST;
	}
}
