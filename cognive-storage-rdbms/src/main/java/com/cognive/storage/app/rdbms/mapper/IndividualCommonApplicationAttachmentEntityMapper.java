package com.cognive.storage.app.rdbms.mapper;

import org.mapstruct.Mapper;

import com.cognive.core.model.common.Attachment;
import com.cognive.storage.app.rdbms.entity.business.IndividualCommonApplicationAttachmentEntity;

@Mapper(componentModel = "spring", uses = { PersonRelationshipEntityMapper.class })
public interface IndividualCommonApplicationAttachmentEntityMapper extends 
	BaseEntityMapper<Attachment, IndividualCommonApplicationAttachmentEntity> {

}
