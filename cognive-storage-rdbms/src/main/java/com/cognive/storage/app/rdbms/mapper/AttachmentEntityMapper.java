package com.cognive.storage.app.rdbms.mapper;

import org.mapstruct.Mapper;

import com.cognive.core.model.common.Attachment;
import com.cognive.storage.app.rdbms.entity.base.BaseAttachmentEntity;

@Mapper(componentModel = "spring")
public interface AttachmentEntityMapper extends BaseEntityMapper<Attachment, BaseAttachmentEntity> {

}
