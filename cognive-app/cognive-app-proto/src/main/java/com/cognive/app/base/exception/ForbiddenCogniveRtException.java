package com.cognive.app.base.exception;

import org.springframework.http.HttpStatus;

import com.cognive.core.model.RequestInfo;

public class ForbiddenCogniveRtException extends RestCogniveRtException {

	private static final long serialVersionUID = 8207930363997738545L;

	public ForbiddenCogniveRtException() {
		super();
	}

	public ForbiddenCogniveRtException(String message) {
		super(message);
	}

	public ForbiddenCogniveRtException(String message, Throwable cause) {
		super(message, cause);
	}

	public ForbiddenCogniveRtException(String message, Throwable cause, RequestInfo requestInfo) {
		super(message, cause, requestInfo);
	}
	
	protected HttpStatus getDefaultHttpStatus() {
		return HttpStatus.FORBIDDEN;
	}
}
