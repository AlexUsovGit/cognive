package com.cognive.core.exception;

public class CogniveRtException extends RuntimeException {

	private static final long serialVersionUID = 2541486987790286116L;

	public CogniveRtException() {
		super();
	}

	public CogniveRtException(String message) {
		super(message);
	}

	public CogniveRtException(Throwable cause) {
		super(cause);
	}

	public CogniveRtException(String message, Throwable cause) {
		super(message, cause);
	}

	public CogniveRtException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
