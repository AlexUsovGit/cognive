package com.cognive.storage.app.rdbms.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import com.cognive.core.model.BasicBo;
import com.cognive.storage.app.rdbms.entity.BasicEntity;

@Mapper(componentModel = "spring")
public interface BasicBoMapper {

	// CustomerMapper INSTANCE = Mappers.getMapper( CustomerMapper.class );
	
	BasicEntity boToEntity(BasicBo bo);
	
	BasicBo entityToBo(BasicEntity entity);
	
	@Mappings({
		@Mapping(target = "id", ignore = true),
		@Mapping(target = "createdBy", ignore = true),
		@Mapping(target = "createdOn", ignore = true),
		@Mapping(target = "modifiedBy", ignore = true),
		@Mapping(target = "modifiedOn", ignore = true)
	})
	void updateEntity(BasicEntity source, @MappingTarget BasicEntity target);
	
	List<BasicBo> entitiesToBoList(Iterable<BasicEntity> entities);
	
}
