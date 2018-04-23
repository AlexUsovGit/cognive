package com.cognive.app.base.rest.model;

public class ItemsPage {

	public static final int DEFAULT_PAGE_SIZE = 25;
	
	private int page = 0;
	private int size = DEFAULT_PAGE_SIZE;
	private long total;
	
	private boolean asc = false;
	private String sortBy;

	public ItemsPage cloneAsItemsPage() {
		ItemsPage result = new ItemsPage();
		result.setAsc(asc);
		result.setPage(page);
		result.setSize(size);
		result.setSortBy(sortBy);
		result.setTotal(total);
		return result;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if (page < 0) {
			this.page = 0;
		}
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size < 0) {
			this.size = DEFAULT_PAGE_SIZE;
		}
		this.size = size;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		if (total < 0) {
			this.total = 0;
		}
		this.total = total;
	}

	public boolean isAsc() {
		return asc;
	}

	public void setAsc(boolean asc) {
		this.asc = asc;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}
	
}
