package com.cognive.storage.app.rdbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.cognive.core.model.common.Organization;
import com.cognive.core.service.OrganizationService;
import com.cognive.storage.app.rdbms.entity.common.OrganizationEntity;
import com.cognive.storage.app.rdbms.mapper.BaseModifiableEntityMapper;
import com.cognive.storage.app.rdbms.mapper.OrganizationEntityMapper;
import com.cognive.storage.app.rdbms.repo.OrganizationEntityRepo;
import com.cognive.storage.rdbms.service.BaseModifiableServicePg;

@Service
public class OrganizationServicePg extends BaseModifiableServicePg<Organization, OrganizationEntity> implements OrganizationService {

	@Autowired
	private OrganizationEntityMapper mapper;
	
	@Autowired
	private OrganizationEntityRepo repo;

	@Override
	protected BaseModifiableEntityMapper<Organization, OrganizationEntity> getMapper() {
		return mapper;
	}

	@Override
	protected PagingAndSortingRepository<OrganizationEntity, Long> getRepo() {
		return repo;
	}

}
