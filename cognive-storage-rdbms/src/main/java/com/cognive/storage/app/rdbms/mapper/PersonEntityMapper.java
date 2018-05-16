package com.cognive.storage.app.rdbms.mapper;

import org.mapstruct.Mapper;

import com.cognive.core.model.common.Person;
import com.cognive.storage.app.rdbms.entity.common.PersonEntity;

@Mapper(componentModel = "spring")
public interface PersonEntityMapper extends BaseModifiableEntityMapper<Person, PersonEntity> {

}
