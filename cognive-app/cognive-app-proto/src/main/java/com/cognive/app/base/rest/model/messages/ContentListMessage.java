package com.cognive.app.base.rest.model.messages;

import java.util.List;

public class ContentListMessage<T> extends StatusMessage {

	private List<T> items;

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}

}
