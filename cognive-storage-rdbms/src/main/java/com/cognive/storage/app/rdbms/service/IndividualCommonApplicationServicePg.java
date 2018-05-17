package com.cognive.storage.app.rdbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.cognive.core.model.business.IndividualCommonApplication;
import com.cognive.core.service.IndividualCommonApplicationService;
import com.cognive.storage.app.rdbms.entity.business.IndividualCommonApplicationEntity;
import com.cognive.storage.app.rdbms.mapper.BaseModifiableEntityMapper;
import com.cognive.storage.app.rdbms.mapper.IndividualCommonApplicationEntityMapper;
import com.cognive.storage.app.rdbms.repo.IndividualCommonApplicationEntityRepo;
import com.cognive.storage.rdbms.service.BaseModifiableServicePg;

@Service
public class IndividualCommonApplicationServicePg extends BaseModifiableServicePg<IndividualCommonApplication, IndividualCommonApplicationEntity> implements IndividualCommonApplicationService {

	@Autowired
	private IndividualCommonApplicationEntityMapper mapper;
	
	@Autowired
	private IndividualCommonApplicationEntityRepo repo;

	@Override
	protected BaseModifiableEntityMapper<IndividualCommonApplication, IndividualCommonApplicationEntity> getMapper() {
		return mapper;
	}

	@Override
	protected PagingAndSortingRepository<IndividualCommonApplicationEntity, Long> getRepo() {
		return repo;
	}

}
