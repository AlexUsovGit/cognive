package com.cognive.storage.app.rdbms.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.cognive.core.model.common.Document;
import com.cognive.core.model.common.Person;
import com.cognive.storage.app.rdbms.entity.common.DocumentEntity;
import com.cognive.storage.app.rdbms.entity.common.PersonEntity;

@Mapper(componentModel = "spring")
public interface DocumentEntityMapper extends BaseEntityMapper<Document, DocumentEntity> {
	
	@Mappings({ @Mapping(target = "documents", ignore = true) })
	PersonEntity boToEntity(Person bo);

	@Mappings({ @Mapping(target = "documents", ignore = true) })
	Person entityToBo(PersonEntity entity);
}
