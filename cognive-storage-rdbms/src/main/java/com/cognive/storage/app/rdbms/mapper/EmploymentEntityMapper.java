package com.cognive.storage.app.rdbms.mapper;

import org.mapstruct.Mapper;

import com.cognive.core.model.common.Employment;
import com.cognive.storage.app.rdbms.entity.common.EmploymentEntity;

@Mapper(componentModel = "spring")
public interface EmploymentEntityMapper extends BaseModifiableEntityMapper<Employment, EmploymentEntity> {

}
