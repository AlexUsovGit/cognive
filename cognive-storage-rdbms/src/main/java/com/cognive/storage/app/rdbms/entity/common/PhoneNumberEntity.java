package com.cognive.storage.app.rdbms.entity.common;

import javax.persistence.Entity;

import com.cognive.storage.rdbms.entity.BaseEntity;

@Entity
public class PhoneNumberEntity extends BaseEntity {

	private long personId;
	private long organizationId;

	private String number;
	private String type;
	
	// TODO: add ext num
	// office: empl | org

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