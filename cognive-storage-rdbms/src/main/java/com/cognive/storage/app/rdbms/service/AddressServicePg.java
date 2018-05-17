package com.cognive.storage.app.rdbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.cognive.core.model.common.Address;
import com.cognive.core.service.AddressService;
import com.cognive.storage.app.rdbms.entity.common.AddressEntity;
import com.cognive.storage.app.rdbms.mapper.AddressEntityMapper;
import com.cognive.storage.app.rdbms.mapper.BaseEntityMapper;
import com.cognive.storage.app.rdbms.repo.AddressEntityRepo;
import com.cognive.storage.rdbms.service.BaseServicePg;

@Service
public class AddressServicePg extends BaseServicePg<Address, AddressEntity> implements AddressService {

	@Autowired
	private AddressEntityMapper mapper;
	
	@Autowired
	private AddressEntityRepo repo;

	@Override
	protected BaseEntityMapper<Address, AddressEntity> getMapper() {
		return mapper;
	}

	@Override
	protected PagingAndSortingRepository<AddressEntity, Long> getRepo() {
		return repo;
	}

}
