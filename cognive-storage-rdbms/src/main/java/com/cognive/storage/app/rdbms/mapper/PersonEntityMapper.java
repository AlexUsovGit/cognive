package com.cognive.storage.app.rdbms.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.cognive.core.model.common.Document;
import com.cognive.core.model.common.Person;
import com.cognive.storage.app.rdbms.entity.common.DocumentEntity;
import com.cognive.storage.app.rdbms.entity.common.PersonEntity;

@Mapper(componentModel = "spring")
public interface PersonEntityMapper extends BaseModifiableEntityMapper<Person, PersonEntity> {

	@Mappings({ 
        @Mapping(target = "owner", ignore = true)
    })
	DocumentEntity boToEntity(Document bo);
	
	@Mappings({ 
        @Mapping(target = "owner", ignore = true)
    })	
	Document entityToBo(DocumentEntity entity);	
	
}
