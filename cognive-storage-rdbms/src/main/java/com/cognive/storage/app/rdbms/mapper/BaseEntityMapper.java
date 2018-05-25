package com.cognive.storage.app.rdbms.mapper;

import java.util.List;

import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import com.cognive.core.model.base.BaseBusinessObject;
import com.cognive.storage.rdbms.entity.BaseEntity;

// @Mapper(componentModel = "spring")
public interface BaseEntityMapper<BO extends BaseBusinessObject, E extends BaseEntity> {

	// @Mappings
	E boToEntity(BO bo);
	
	// @InheritInverseConfiguration
	BO entityToBo(E entity);
	
	// FIXME: remove this method
	@Mappings({
		@Mapping(target = "id", ignore = true),
		@Mapping(target = "createdBy", ignore = true),
		@Mapping(target = "createdOn", ignore = true)
	})
	void updateAsBaseEntity(E source, @MappingTarget E target);
	
	List<BO> entitiesToBoList(Iterable<E> entities);
	
	// Page<BO> entitiesToBoList(Page<E> entities);
	
}
