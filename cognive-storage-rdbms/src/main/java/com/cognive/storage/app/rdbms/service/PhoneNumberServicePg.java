package com.cognive.storage.app.rdbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.cognive.core.model.common.PhoneNumber;
import com.cognive.core.service.PhoneNumberService;
import com.cognive.storage.app.rdbms.entity.common.PhoneNumberEntity;
import com.cognive.storage.app.rdbms.mapper.PhoneNumberEntityMapper;
import com.cognive.storage.app.rdbms.mapper.BaseEntityMapper;
import com.cognive.storage.app.rdbms.repo.PhoneNumberEntityRepo;
import com.cognive.storage.rdbms.service.BaseServicePg;

@Service
public class PhoneNumberServicePg extends BaseServicePg<PhoneNumber, PhoneNumberEntity> implements PhoneNumberService {

	@Autowired
	private PhoneNumberEntityMapper mapper;
	
	@Autowired
	private PhoneNumberEntityRepo repo;

	@Override
	protected BaseEntityMapper<PhoneNumber, PhoneNumberEntity> getMapper() {
		return mapper;
	}

	@Override
	protected PagingAndSortingRepository<PhoneNumberEntity, Long> getRepo() {
		return repo;
	}

}
