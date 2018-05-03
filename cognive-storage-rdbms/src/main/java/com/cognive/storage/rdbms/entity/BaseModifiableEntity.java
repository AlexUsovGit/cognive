package com.cognive.storage.rdbms.entity;

import java.util.Date;

public class BaseModifiableEntity extends BaseEntity {

	private Date modifiedOn;
	private String modifiedBy;
	private String modificationComment;

	private String version;
	private String tag;

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

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}
