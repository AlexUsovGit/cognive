package com.cognive.app.base.exception;

import org.springframework.http.HttpStatus;

import com.cognive.core.exception.CogniveRtException;
import com.cognive.core.model.RequestInfo;

public class RestCogniveRtException extends CogniveRtException {

	private static final long serialVersionUID = 8754668414269709832L;
	
	private RequestInfo requestInfo;
	private HttpStatus code; // = getDefaultHttpStatus(); ?
	
	public RestCogniveRtException() {
		super();
	}

	public RestCogniveRtException(String message) {
		super(message);
		this.code = getDefaultHttpStatus();
	}

	public RestCogniveRtException(String message, Throwable cause) {
		super(message, cause);
		this.code = getDefaultHttpStatus();
	}

	public RestCogniveRtException(String message, Throwable cause, RequestInfo requestInfo) {
		super(message, cause);
		this.requestInfo = requestInfo;
		this.code = getDefaultHttpStatus();
	}

	public RestCogniveRtException(String message, Throwable cause, RequestInfo requestInfo, HttpStatus code) {
		super(message, cause);
		this.requestInfo = requestInfo;
		this.code = code;
	}

	public RequestInfo getRequestInfo() {
		return requestInfo;
	}

	public void setRequestInfo(RequestInfo requestInfo) {
		this.requestInfo = requestInfo;
	}

	public HttpStatus getCode() {
		return code;
	}

	public void setCode(HttpStatus code) {
		this.code = code;
	}

	protected HttpStatus getDefaultHttpStatus() {
		return HttpStatus.INTERNAL_SERVER_ERROR;
	}
}
