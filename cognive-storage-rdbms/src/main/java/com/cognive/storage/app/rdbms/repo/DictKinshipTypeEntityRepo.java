package com.cognive.storage.app.rdbms.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognive.storage.app.rdbms.entity.dict.DictKinshipTypeEntity;

@Repository
public interface DictKinshipTypeEntityRepo extends CrudRepository<DictKinshipTypeEntity, String> {
}
