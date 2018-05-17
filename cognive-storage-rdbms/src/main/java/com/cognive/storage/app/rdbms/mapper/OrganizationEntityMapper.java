package com.cognive.storage.app.rdbms.mapper;

import org.mapstruct.Mapper;

import com.cognive.core.model.common.Organization;
import com.cognive.storage.app.rdbms.entity.common.OrganizationEntity;

@Mapper(componentModel = "spring")
public interface OrganizationEntityMapper extends BaseModifiableEntityMapper<Organization, OrganizationEntity> {

}
