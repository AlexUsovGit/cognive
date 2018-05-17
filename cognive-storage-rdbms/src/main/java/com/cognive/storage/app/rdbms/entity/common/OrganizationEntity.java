package com.cognive.storage.app.rdbms.entity.common;

import javax.persistence.Entity;

import com.cognive.storage.rdbms.entity.BaseModifiableEntity;

@Entity
public class OrganizationEntity extends BaseModifiableEntity {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
