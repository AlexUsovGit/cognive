package com.cognive.storage.app.rdbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.cognive.core.model.CountryDictItem;
import com.cognive.storage.app.rdbms.entity.DictCountryEntity;
import com.cognive.storage.app.rdbms.mapper.BaseDictItemMapper;
import com.cognive.storage.app.rdbms.mapper.CountryDictItemMapper;
import com.cognive.storage.app.rdbms.repo.DictCountryEntityRepo;

public class CountryDictCrudServicePg extends BaseDictCrudServicePg<CountryDictItem, DictCountryEntity> {

	@Autowired
	DictCountryEntityRepo repo;
	
	@Autowired
	CountryDictItemMapper mapper;
	
	@Override
	BaseDictItemMapper<CountryDictItem, DictCountryEntity> getMapper() {
		return mapper;
	}

	@Override
	CrudRepository<DictCountryEntity, String> getRepo() {
		return repo;
	}

}
