package com.cognive.storage.app.rdbms.mapper;

import org.mapstruct.Mapper;

import com.cognive.core.model.common.Document;
import com.cognive.storage.app.rdbms.entity.common.DocumentEntity;

@Mapper(componentModel = "spring")
public interface DocumentEntityMapper extends BaseEntityMapper<Document, DocumentEntity> {

}
