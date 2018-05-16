package com.cognive.storage.app.rdbms.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cognive.storage.app.rdbms.entity.business.IndividualCommonApplicationEntity;

@Repository
public interface IndividualCommonApplicationEntityRepo extends PagingAndSortingRepository<IndividualCommonApplicationEntity, Long> {
}
