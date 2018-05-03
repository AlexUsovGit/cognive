package com.cognive.core.exception;

public class NotFoundCogniveRtException extends CogniveRtException {

	private static final long serialVersionUID = -6484324644012912465L;

	public NotFoundCogniveRtException() {
		super();
	}

	public NotFoundCogniveRtException(String message) {
		super(message);
	}

	public NotFoundCogniveRtException(String message, Throwable cause) {
		super(message, cause);
	}

}
