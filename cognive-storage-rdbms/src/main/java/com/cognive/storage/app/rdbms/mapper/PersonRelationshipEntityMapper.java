package com.cognive.storage.app.rdbms.mapper;

import org.mapstruct.Mapper;

import com.cognive.core.model.common.PersonRelationship;
import com.cognive.storage.app.rdbms.entity.common.PersonRelationshipEntity;

@Mapper(componentModel = "spring")
public interface PersonRelationshipEntityMapper extends BaseEntityMapper<PersonRelationship, PersonRelationshipEntity> {

}
