package com.cognive.storage.app.rdbms.entity.business;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.cognive.storage.app.rdbms.entity.base.BaseAttachmentEntity;

@Entity
@DiscriminatorValue( IndividualCommonApplicationEntity.ATTACHMENT_KIND )
public class IndividualCommonApplicationAttachmentEntity extends BaseAttachmentEntity {

}
