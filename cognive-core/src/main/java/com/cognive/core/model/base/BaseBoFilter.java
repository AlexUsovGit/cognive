package com.cognive.core.model.base;

import java.util.Date;

public class BaseBoFilter extends ItemsPage {

	private String createdBy;
	private Date createdBefore;
	private Date createdAfter;

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedBefore() {
		return createdBefore;
	}

	public void setCreatedBefore(Date createdBefore) {
		this.createdBefore = createdBefore;
	}

	public Date getCreatedAfter() {
		return createdAfter;
	}

	public void setCreatedAfter(Date createdAfter) {
		this.createdAfter = createdAfter;
	}

}
