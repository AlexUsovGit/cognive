package com.cognive.core.model.base;

import java.util.Date;

public class BaseModifiableBusinessObject extends BaseBusinessObject {

	private Date modifiedOn;
	private String modifiedBy;
	private String modificationComment;

//	private String version;
//	private String tag;

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModificationComment() {
		return modificationComment;
	}

	public void setModificationComment(String modificationComment) {
		this.modificationComment = modificationComment;
	}

}
