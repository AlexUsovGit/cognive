package com.cognive.storage.app.rdbms.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognive.storage.app.rdbms.entity.DictCountryEntity;

@Repository
public interface DictCountryEntityRepo extends CrudRepository<DictCountryEntity, String> {
}
