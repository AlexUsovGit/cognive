package com.cognive.storage.app.rdbms.entity.business;

import java.io.Serializable;
import java.util.List;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import com.cognive.storage.app.rdbms.entity.base.BaseAttachmentEntity;
import com.cognive.storage.rdbms.entity.BaseModifiableEntity;

@MappedSuperclass
//@Entity
//@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
//@DiscriminatorColumn( name = "kind" )
public class BaseApplicationEntity extends BaseModifiableEntity implements Serializable {

	private String name;
	private String type;
	private String kind;
	private String status;
	
	@OneToMany(mappedBy = "ownerId")
	private List<BaseAttachmentEntity> attachments;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<BaseAttachmentEntity> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<BaseAttachmentEntity> attachments) {
		// TODO: verify
		if (attachments != null) {
			attachments.forEach( item -> {
				item.setOwnerId(this.getId());
			});
		}
		this.attachments = attachments;
	}
	
}
