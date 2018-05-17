package com.cognive.storage.app.rdbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.cognive.core.model.common.Employment;
import com.cognive.core.service.EmploymentService;
import com.cognive.storage.app.rdbms.entity.common.EmploymentEntity;
import com.cognive.storage.app.rdbms.mapper.BaseModifiableEntityMapper;
import com.cognive.storage.app.rdbms.mapper.EmploymentEntityMapper;
import com.cognive.storage.app.rdbms.repo.EmploymentEntityRepo;
import com.cognive.storage.rdbms.service.BaseModifiableServicePg;

@Service
public class EmploymentServicePg extends BaseModifiableServicePg<Employment, EmploymentEntity> implements EmploymentService {

	@Autowired
	private EmploymentEntityMapper mapper;
	
	@Autowired
	private EmploymentEntityRepo repo;

	@Override
	protected BaseModifiableEntityMapper<Employment, EmploymentEntity> getMapper() {
		return mapper;
	}

	@Override
	protected PagingAndSortingRepository<EmploymentEntity, Long> getRepo() {
		return repo;
	}

}
