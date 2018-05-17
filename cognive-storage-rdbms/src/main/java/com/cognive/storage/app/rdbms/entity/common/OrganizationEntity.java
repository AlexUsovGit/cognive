package com.cognive.storage.app.rdbms.entity.common;

import com.cognive.storage.rdbms.entity.BaseModifiableEntity;

public class OrganizationEntity extends BaseModifiableEntity {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
