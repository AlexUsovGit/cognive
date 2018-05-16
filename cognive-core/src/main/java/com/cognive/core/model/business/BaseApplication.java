package com.cognive.core.model.business;

import java.util.List;

import com.cognive.core.model.base.BaseModifiableBusinessObject;
import com.cognive.core.model.common.Attachment;

public class BaseApplication extends BaseModifiableBusinessObject {

	private String name;
	private String type;
	private String kind;
	private String status;

	private List<Attachment> attachments;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

}
