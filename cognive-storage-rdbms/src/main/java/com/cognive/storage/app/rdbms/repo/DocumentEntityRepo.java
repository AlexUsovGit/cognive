package com.cognive.storage.app.rdbms.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cognive.storage.app.rdbms.entity.common.DocumentEntity;

@Repository
public interface DocumentEntityRepo extends PagingAndSortingRepository<DocumentEntity, Long> {
}
