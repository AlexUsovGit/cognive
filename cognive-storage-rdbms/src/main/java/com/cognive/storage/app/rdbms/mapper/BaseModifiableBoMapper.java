package com.cognive.storage.app.rdbms.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import com.cognive.core.model.base.BaseModifiableBusinessObject;
import com.cognive.storage.rdbms.entity.BaseModifiableEntity;

// @Mapper(componentModel = "spring")
public interface BaseModifiableBoMapper<BO extends BaseModifiableBusinessObject, E extends BaseModifiableEntity> {

	E boToEntity(BO bo);
	
	BO entityToBo(E entity);
	
	@Mappings({
		@Mapping(target = "id", ignore = true),
		@Mapping(target = "createdBy", ignore = true),
		@Mapping(target = "createdOn", ignore = true),
		@Mapping(target = "modifiedBy", ignore = true),
		@Mapping(target = "modifiedOn", ignore = true)
	})
	void updateEntity(E source, @MappingTarget E target);
	
	List<BO> entitiesToBoList(Iterable<E> entities);
	
}
