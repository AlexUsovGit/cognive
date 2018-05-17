package com.cognive.storage.app.rdbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.cognive.core.model.common.PersonRelationship;
import com.cognive.core.service.PersonRelationshipService;
import com.cognive.storage.app.rdbms.entity.common.PersonRelationshipEntity;
import com.cognive.storage.app.rdbms.mapper.PersonRelationshipEntityMapper;
import com.cognive.storage.app.rdbms.mapper.BaseEntityMapper;
import com.cognive.storage.app.rdbms.repo.PersonRelationshipEntityRepo;
import com.cognive.storage.rdbms.service.BaseServicePg;

@Service
public class PersonRelationshipServicePg extends BaseServicePg<PersonRelationship, PersonRelationshipEntity> implements PersonRelationshipService {

	@Autowired
	private PersonRelationshipEntityMapper mapper;
	
	@Autowired
	private PersonRelationshipEntityRepo repo;

	@Override
	protected BaseEntityMapper<PersonRelationship, PersonRelationshipEntity> getMapper() {
		return mapper;
	}

	@Override
	protected PagingAndSortingRepository<PersonRelationshipEntity, Long> getRepo() {
		return repo;
	}

}
