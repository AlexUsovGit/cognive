package com.cognive.app.base.exception;

import org.springframework.http.HttpStatus;

import com.cognive.app.base.rest.model.RequestInfo;

public class UnauthorizedCogniveRtException extends RestCogniveRtException {

	private static final long serialVersionUID = 6812450131478081893L;

	public UnauthorizedCogniveRtException() {
		super();
	}

	public UnauthorizedCogniveRtException(String message) {
		super(message);
	}

	public UnauthorizedCogniveRtException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnauthorizedCogniveRtException(String message, Throwable cause, RequestInfo requestInfo) {
		super(message, cause, requestInfo);
	}
	
	protected HttpStatus getDefaultHttpStatus() {
		return HttpStatus.UNAUTHORIZED;
	}
}
