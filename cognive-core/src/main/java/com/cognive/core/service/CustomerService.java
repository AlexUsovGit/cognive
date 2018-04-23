package com.cognive.core.service;

import java.util.List;

import com.cognive.core.model.Customer;

public interface CustomerService {

	Customer create(Customer customer);
	
	Customer getById(String id);
	
	List<Customer> find(String id);
	
	Customer update(Customer customer);
	
	void delete(String id);
	
}
