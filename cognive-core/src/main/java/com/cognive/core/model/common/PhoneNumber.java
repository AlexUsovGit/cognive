package com.cognive.core.model.common;

import com.cognive.core.model.base.BaseBusinessObject;

public class PhoneNumber extends BaseBusinessObject {

	private long personId;
	private long organizationId;

	private String number;
	private String type;

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(long organizationId) {
		this.organizationId = organizationId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
