package com.cognive.storage.app.rdbms.entity.common;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cognive.storage.rdbms.entity.BaseModifiableEntity;

@Entity
@Table(name = "Employment")
public class EmploymentEntity extends BaseModifiableEntity implements Serializable {

	@ManyToOne
	private OrganizationEntity organization;
	private String type;
	private String position;
	@Column(name = "started")
	private Date from;
	// TODO: from - finish
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
