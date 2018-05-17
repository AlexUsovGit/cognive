package com.cognive.storage.app.rdbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.cognive.core.model.dict.CountryDictItem;
import com.cognive.core.service.dict.CountryDictService;
import com.cognive.storage.app.rdbms.entity.dict.DictCountryEntity;
import com.cognive.storage.app.rdbms.mapper.BaseDictItemMapper;
import com.cognive.storage.app.rdbms.mapper.CountryDictItemMapper;
import com.cognive.storage.app.rdbms.repo.DictCountryEntityRepo;
import com.cognive.storage.rdbms.service.BaseDictCrudServicePg;

@Service
public class CountryDictCrudServicePg extends BaseDictCrudServicePg<CountryDictItem, DictCountryEntity> implements CountryDictService {

	@Autowired
	DictCountryEntityRepo repo;
	
	@Autowired
	CountryDictItemMapper mapper;
	
	@Override
	public BaseDictItemMapper<CountryDictItem, DictCountryEntity> getMapper() {
		return mapper;
	}

	@Override
	public CrudRepository<DictCountryEntity, String> getRepo() {
		return repo;
	}
	
}
