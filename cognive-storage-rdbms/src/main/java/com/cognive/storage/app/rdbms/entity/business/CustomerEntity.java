package com.cognive.storage.app.rdbms.entity.business;

import java.util.List;

import com.cognive.core.model.banking.Account;
import com.cognive.core.model.common.Person;

public class CustomerEntity {

	private Person person;
	private List<Account> accounts;
	private List<BaseApplicationEntity> application;
	
}
