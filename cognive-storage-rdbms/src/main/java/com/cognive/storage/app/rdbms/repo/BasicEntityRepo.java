package com.cognive.storage.app.rdbms.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cognive.storage.app.rdbms.entity.BasicEntity;

@Repository

public interface BasicEntityRepo extends PagingAndSortingRepository<BasicEntity, String> {
}
