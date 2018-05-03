package com.cognive.app.base.rest.model.messages;

import java.util.List;

import com.cognive.core.model.base.ItemsPage;

public class PagedContentMessage<T> extends StatusMessage {

	private List<T> items;
	private ItemsPage page;

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}

	public ItemsPage getPage() {
		return page;
	}

	public void setPage(ItemsPage page) {
		this.page = page;
	}

}
