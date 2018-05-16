package com.cognive.storage.rdbms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
abstract public class BaseModifiableEntity extends BaseEntity {

	private Date modifiedOn;
	private String modifiedBy;
	
	@Column(name = "modificationComment")
	private String modificationComment;

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
