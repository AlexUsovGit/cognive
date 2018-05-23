package com.cognive.core.service;

import java.util.List;

import com.cognive.core.model.common.Person;
import com.cognive.core.model.filter.PersonSearchFilter;
import com.cognive.core.service.base.BaseModifiableBoCrudService;

public interface PersonService extends BaseModifiableBoCrudService<Person> {

	List<Person> find(PersonSearchFilter filter);

}
