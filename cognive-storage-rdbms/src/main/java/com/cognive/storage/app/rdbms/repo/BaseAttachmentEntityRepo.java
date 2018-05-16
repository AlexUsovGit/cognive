package com.cognive.storage.app.rdbms.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cognive.storage.app.rdbms.entity.base.BaseAttachmentEntity;

@Repository
public interface BaseAttachmentEntityRepo extends PagingAndSortingRepository<BaseAttachmentEntity, Long> {
}
