package com.cognive.core.model.base;

import java.util.Date;

public class ModifiableBoFilter extends BaseBoFilter {

	private String modifiedBy;
	private Date modifiedAfter;
	private Date modifiedBefore;

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedAfter() {
		return modifiedAfter;
	}

	public void setModifiedAfter(Date modifiedAfter) {
		this.modifiedAfter = modifiedAfter;
	}

	public Date getModifiedBefore() {
		return modifiedBefore;
	}

	public void setModifiedBefore(Date modifiedBefore) {
		this.modifiedBefore = modifiedBefore;
	}

}
