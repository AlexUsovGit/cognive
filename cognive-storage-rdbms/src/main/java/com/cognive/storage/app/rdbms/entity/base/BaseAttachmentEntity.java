package com.cognive.storage.app.rdbms.entity.base;

import java.sql.Blob;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;

import com.cognive.storage.rdbms.entity.BaseEntity;

@Entity
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name = "kind" )
public class BaseAttachmentEntity extends BaseEntity {

	private String name;
	private String type;
	private String kind;
	private String contentType;
	
	// TODO: owner of the attachment
	private Long ownerId;
	
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private Blob data;

	// @Column(length=100000)
	// private byte[] data;
	// private java.sql.Blob data;
	
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

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Blob getData() {
		return data;
	}

	public void setData(Blob data) {
		this.data = data;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}
	
}
