package com.cognive.storage.app.rdbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.cognive.core.model.KinshipTypeDictItem;
import com.cognive.storage.app.rdbms.entity.DictKinshipTypeEntity;
import com.cognive.storage.app.rdbms.mapper.BaseDictItemMapper;
import com.cognive.storage.app.rdbms.mapper.KinshipTypeDictItemMapper;
import com.cognive.storage.app.rdbms.repo.DictKinshipTypeEntityRepo;

public class KinshipTypeDictCrudServicePg extends BaseDictCrudServicePg<KinshipTypeDictItem, DictKinshipTypeEntity> {

	@Autowired
	DictKinshipTypeEntityRepo repo;
	
	@Autowired
	KinshipTypeDictItemMapper mapper;
	
	@Override
	BaseDictItemMapper<KinshipTypeDictItem, DictKinshipTypeEntity> getMapper() {
		return mapper;
	}

	@Override
	CrudRepository<DictKinshipTypeEntity, String> getRepo() {
		return repo;
	}

}
