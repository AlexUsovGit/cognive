package com.cognive.storage.app.rdbms.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cognive.storage.app.rdbms.entity.common.OrganizationEntity;

@Repository
public interface OrganizationEntityRepo extends PagingAndSortingRepository<OrganizationEntity, Long> {
}
