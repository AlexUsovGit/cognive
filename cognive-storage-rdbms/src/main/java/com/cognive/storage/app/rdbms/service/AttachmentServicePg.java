package com.cognive.storage.app.rdbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.cognive.core.model.common.Attachment;
import com.cognive.core.service.AttachmentService;
import com.cognive.storage.app.rdbms.entity.base.BaseAttachmentEntity;
import com.cognive.storage.app.rdbms.mapper.AttachmentEntityMapper;
import com.cognive.storage.app.rdbms.mapper.BaseEntityMapper;
import com.cognive.storage.app.rdbms.repo.BaseAttachmentEntityRepo;
import com.cognive.storage.rdbms.service.BaseServicePg;

@Service
public class AttachmentServicePg extends BaseServicePg<Attachment, BaseAttachmentEntity> implements AttachmentService {

	@Autowired
	private AttachmentEntityMapper mapper;
	
	@Autowired
	private BaseAttachmentEntityRepo repo;

	@Override
	protected BaseEntityMapper<Attachment, BaseAttachmentEntity> getMapper() {
		return mapper;
	}

	@Override
	protected PagingAndSortingRepository<BaseAttachmentEntity, Long> getRepo() {
		return repo;
	}

}
