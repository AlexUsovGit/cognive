package com.cognive.core.model.common;

import java.util.Date;
import java.util.List;

import com.cognive.core.model.base.BaseModifiableBusinessObject;

public class Employment extends BaseModifiableBusinessObject {

	private String type;
	private Organization organization;
	private String position;
	private Date from;
	private String details;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
