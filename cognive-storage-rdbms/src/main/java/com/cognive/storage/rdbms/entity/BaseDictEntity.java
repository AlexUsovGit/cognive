package com.cognive.storage.rdbms.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class BaseDictEntity {

	@Id
	@Column(nullable = false, unique = true)
	private String code;

	@Column(nullable = false)
	private String name;
	private String description;
	
	// TODO: add time, user

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
