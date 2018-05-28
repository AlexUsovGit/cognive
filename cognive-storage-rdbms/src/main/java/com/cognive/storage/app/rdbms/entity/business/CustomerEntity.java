package com.cognive.storage.app.rdbms.entity.business;

import java.util.List;

import com.cognive.core.model.banking.Account;
import com.cognive.core.model.common.Person;

public class CustomerEntity {

//	private Person person;
//	private List<Account> accounts;
//	private List<BaseApplicationEntity> application;
	
	private String id;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
