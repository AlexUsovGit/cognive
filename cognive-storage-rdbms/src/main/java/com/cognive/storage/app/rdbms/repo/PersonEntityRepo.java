package com.cognive.storage.app.rdbms.repo;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cognive.storage.app.rdbms.entity.common.PersonEntity;

@Repository
public interface PersonEntityRepo extends PagingAndSortingRepository<PersonEntity, Long>, JpaSpecificationExecutor<PersonEntity> {
}
