package com.cognive.storage.app.rdbms.mapper;

import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import com.cognive.core.model.base.BaseModifiableBusinessObject;
import com.cognive.storage.rdbms.entity.BaseModifiableEntity;

// @Mapper(componentModel = "spring")
public interface BaseModifiableEntityMapper<BO extends BaseModifiableBusinessObject, E extends BaseModifiableEntity>
	extends BaseEntityMapper<BO, E>{

	@Mappings({
		@Mapping(target = "id", ignore = true),
		@Mapping(target = "createdBy", ignore = true),
		@Mapping(target = "createdOn", ignore = true),
		@Mapping(target = "modifiedBy", ignore = true),
		@Mapping(target = "modifiedOn", ignore = true)
	})
	void updateEntity(E source, @MappingTarget E target);
	
}
