package com.cognive.core.model.common;

import com.cognive.core.model.base.BaseBusinessObject;

public class Attachment extends BaseBusinessObject {

	private String name;
	private String type;
	private String kind;
	private String contentType;
	
	private long ownerId;

	// FIXME: define
	// private byte[] data;
	private java.sql.Blob data;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public java.sql.Blob getData() {
		return data;
	}

	public void setData(java.sql.Blob data) {
		this.data = data;
	}

	public long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}
	
	

}
