package com.cognive.storage.app.rdbms.entity.common;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cognive.storage.rdbms.entity.BaseModifiableEntity;

@Entity
@Table(name = "Organization")
public class OrganizationEntity extends BaseModifiableEntity implements Serializable {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
