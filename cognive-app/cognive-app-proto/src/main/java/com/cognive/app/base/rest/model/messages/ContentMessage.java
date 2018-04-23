package com.cognive.app.base.rest.model.messages;

public class ContentMessage<T> extends StatusMessage {

	private T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
}
