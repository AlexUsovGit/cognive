package com.cognive.storage.app.rdbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.cognive.core.model.common.Document;
import com.cognive.core.service.DocumentService;
import com.cognive.storage.app.rdbms.entity.common.DocumentEntity;
import com.cognive.storage.app.rdbms.mapper.DocumentEntityMapper;
import com.cognive.storage.app.rdbms.mapper.BaseEntityMapper;
import com.cognive.storage.app.rdbms.repo.DocumentEntityRepo;
import com.cognive.storage.rdbms.service.BaseServicePg;

@Service
public class DocumentServicePg extends BaseServicePg<Document, DocumentEntity> implements DocumentService {

	@Autowired
	private DocumentEntityMapper mapper;
	
	@Autowired
	private DocumentEntityRepo repo;

	@Override
	protected BaseEntityMapper<Document, DocumentEntity> getMapper() {
		return mapper;
	}

	@Override
	protected PagingAndSortingRepository<DocumentEntity, Long> getRepo() {
		return repo;
	}

}
