package com.cognive.app.base.rest.model.messages;

import org.springframework.http.HttpStatus;

import com.cognive.core.model.RequestInfo;

public class StatusMessage {

	private HttpStatus status = HttpStatus.OK; // remove dependency on Spring?
	
	private String message;
	private Integer messageCode; // app specific code

	private Boolean isError = Boolean.FALSE;
	private String description;

	private RequestInfo requestInfo;
	
	protected StatusMessage() {
	}
	
	/**
	 * @param statusCode
	 * @param message
	 */
	public StatusMessage(int statusCode, String message) {
		super();
		this.status = HttpStatus.valueOf(statusCode);
		this.message = message;

		isError = null;
		description = null;
		requestInfo = null;
	}

	/**
	 * @return the status
	 */
	public HttpStatus getStatus() {
		return status;
	}

	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return status.value();
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(int statusCode) {
		this.status = HttpStatus.valueOf(statusCode);
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return the isError
	 */
	public Boolean getIsError() {
		return isError;
	}

	/**
	 * @return the payload
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the requestInfo
	 */
	public RequestInfo getRequestInfo() {
		return requestInfo;
	}

	/**
	 * @param requestInfo the requestInfo to set
	 */
	public void setRequestInfo(RequestInfo requestInfo) {
		this.requestInfo = requestInfo;
	}
	
	protected void setStatus(HttpStatus status) {
		this.status = status;
		this.isError = status.isError();
	}

	public static MessageBuilder getBuilder() {
		return new MessageBuilder();
	}
	
	/**
	 * @return the messageCode
	 */
	public Integer getMessageCode() {
		return messageCode;
	}

	/**
	 * @param messageCode the messageCode to set
	 */
	public void setMessageCode(Integer messageCode) {
		this.messageCode = messageCode;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public static class MessageBuilder {
		private StatusMessage tmpMessage = new StatusMessage();
		
		public MessageBuilder withStatus(int statusCode) {
			tmpMessage.setStatusCode(statusCode);
			return this;
		}
		
		public MessageBuilder withStatus(HttpStatus status) {
			tmpMessage.setStatus(status);
			return this;
		}
		
		public MessageBuilder withMessage(String message) {
			tmpMessage.message = message;
			return this;
		}
		
		public MessageBuilder withRequestInfo(RequestInfo requestInfo) {
			tmpMessage.requestInfo = requestInfo;
			return this;
		}
		
		public MessageBuilder withIsError(boolean isError) {
			tmpMessage.isError = isError;
			return this;
		}
		
		public MessageBuilder withPayload(String payload) {
			tmpMessage.description = payload;
			return this;
		}

		protected boolean isValid() {
			// any sense?
			return true;
		}
		
		public StatusMessage build() {
			if ( isValid() ) {
				return tmpMessage;
			}
			// throw exception?
			return null;
		}
	}

}
