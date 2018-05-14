package com.cognive.core.service;

import java.util.Collection;
import java.util.List;

public interface BaseDictCrudService<T, ID> {

	T create(T item);
	
	Collection<T> save(Collection<T> items);
	
	T getById(ID id);
	
	List<T> findAll();
	
	T update(T item);
	
	void delete(ID id);	
}
