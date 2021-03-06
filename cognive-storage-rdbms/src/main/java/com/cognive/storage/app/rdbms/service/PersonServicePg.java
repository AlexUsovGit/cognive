package com.cognive.storage.app.rdbms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.cognive.core.exception.NotFoundCogniveRtException;
import com.cognive.core.model.common.Person;
import com.cognive.core.model.filter.PersonSearchFilter;
import com.cognive.core.service.PersonService;
import com.cognive.storage.app.rdbms.entity.common.PersonEntity;
import com.cognive.storage.app.rdbms.mapper.BaseModifiableEntityMapper;
import com.cognive.storage.app.rdbms.mapper.PersonEntityMapper;
import com.cognive.storage.app.rdbms.repo.PersonEntityRepo;
import com.cognive.storage.app.rdbms.spec.PersonFilterSpec;
import com.cognive.storage.rdbms.service.BaseModifiableServicePg;

@Service
public class PersonServicePg extends BaseModifiableServicePg<Person, PersonEntity> implements PersonService {

	@Autowired
	private PersonEntityMapper mapper;
	
	@Autowired
	private PersonEntityRepo repo;

	@Override
	protected BaseModifiableEntityMapper<Person, PersonEntity> getMapper() {
		return mapper;
	}

	@Override
	protected PagingAndSortingRepository<PersonEntity, Long> getRepo() {
		return repo;
	}
	
	@Override
	public Person getFullById(Long id) {
		PersonEntity e = getFullEntityById(id);
		return getMapper().entityToBo(e);
	}

	protected PersonEntity getFullEntityById(Long id) {
		assertValidId(id, "ID is not valid for the getFullById operation.");
		PersonEntity e = repo.findFullById(id);
		if (e == null) {
			throw new NotFoundCogniveRtException("T was not found for id=" + id);
		}
		return e;
	}

	@Override
	public List<Person> find(PersonSearchFilter filter) {
		return getMapper().entitiesToBoList( repo.findAll(new PersonFilterSpec(filter), asPageRequest(filter)) );
	}

}
