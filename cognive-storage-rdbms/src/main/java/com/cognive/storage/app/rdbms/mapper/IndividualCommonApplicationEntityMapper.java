package com.cognive.storage.app.rdbms.mapper;

import org.mapstruct.Mapper;

import com.cognive.core.model.business.IndividualCommonApplication;
import com.cognive.storage.app.rdbms.entity.business.IndividualCommonApplicationEntity;

@Mapper(componentModel = "spring", uses = { PersonRelationshipEntityMapper.class })
public interface IndividualCommonApplicationEntityMapper extends BaseModifiableEntityMapper<IndividualCommonApplication, IndividualCommonApplicationEntity> {

}
