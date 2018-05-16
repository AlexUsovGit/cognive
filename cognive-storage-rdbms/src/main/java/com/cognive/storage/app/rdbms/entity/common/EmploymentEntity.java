package com.cognive.storage.app.rdbms.entity.common;

import java.util.Date;

import javax.persistence.Entity;

import com.cognive.storage.rdbms.entity.BaseModifiableEntity;

@Entity
public class EmploymentEntity extends BaseModifiableEntity {

	private String type;
	private OrganizationEntity organization;
	private String position;
	private Date from;
	private String details;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public OrganizationEntity getOrganization() {
		return organization;
	}

	public void setOrganization(OrganizationEntity organization) {
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
