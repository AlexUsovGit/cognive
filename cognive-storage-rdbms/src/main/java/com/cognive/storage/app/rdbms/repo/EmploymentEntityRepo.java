package com.cognive.storage.app.rdbms.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cognive.storage.app.rdbms.entity.common.EmploymentEntity;

@Repository
public interface EmploymentEntityRepo extends PagingAndSortingRepository<EmploymentEntity, Long> {
}
