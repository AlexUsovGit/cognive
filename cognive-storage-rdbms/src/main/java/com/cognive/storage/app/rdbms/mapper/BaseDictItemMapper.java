package com.cognive.storage.app.rdbms.mapper;

import java.util.List;

import org.mapstruct.MappingTarget;

import com.cognive.core.model.base.BaseDictItem;
import com.cognive.storage.rdbms.entity.BaseDictEntity;

public interface BaseDictItemMapper<BO extends BaseDictItem, E extends BaseDictEntity> {

	E boToEntity(BO bo);
	
	BO entityToBo(E entity);
	
	void updateEntity(E source, @MappingTarget E target);
	
	List<BO> entitiesToBoList(Iterable<E> entities);
	
	List<E> bosToEntitiesList(Iterable<BO> entities);
	
}
