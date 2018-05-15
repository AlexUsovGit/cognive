package com.cognive.storage.app.rdbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.cognive.core.model.dict.KinshipTypeDictItem;
import com.cognive.core.service.KinshipTypeDictService;
import com.cognive.storage.app.rdbms.entity.DictKinshipTypeEntity;
import com.cognive.storage.app.rdbms.mapper.BaseDictItemMapper;
import com.cognive.storage.app.rdbms.mapper.KinshipTypeDictItemMapper;
import com.cognive.storage.app.rdbms.repo.DictKinshipTypeEntityRepo;

@Service
public class KinshipTypeDictCrudServicePg extends BaseDictCrudServicePg<KinshipTypeDictItem, DictKinshipTypeEntity> implements KinshipTypeDictService {

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
