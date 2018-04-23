package com.cognive.app.base.exception;

import org.springframework.http.HttpStatus;

import com.cognive.app.base.rest.model.RequestInfo;

public class NotFoundCogniveRtException extends RestCogniveRtException {

	private static final long serialVersionUID = 6747653662121686484L;

	public NotFoundCogniveRtException() {
		super();
	}

	public NotFoundCogniveRtException(String message) {
		super(message);
	}

	public NotFoundCogniveRtException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotFoundCogniveRtException(String message, Throwable cause, RequestInfo requestInfo) {
		super(message, cause, requestInfo);
	}
	
	protected HttpStatus getDefaultHttpStatus() {
		return HttpStatus.NOT_FOUND;
	}
}
