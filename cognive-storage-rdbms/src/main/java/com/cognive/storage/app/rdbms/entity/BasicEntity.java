package com.cognive.storage.app.rdbms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.databind.JsonNode;

@Entity
@Table(name = "test_basic")
public class BasicEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	// @Column(columnDefinition = "serial")
	private long id;

	private Date createdOn;
	private String createdBy;

	private Date modifiedOn;
	private String modifiedBy;
	private String modificationComment;

	private String value;

	@Type(type = "jsonb")
	@Column(columnDefinition = "jsonb")
	private JsonNode ext;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModificationComment() {
		return modificationComment;
	}

	public void setModificationComment(String modificationComment) {
		this.modificationComment = modificationComment;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public JsonNode getExt() {
		return ext;
	}

	public void setExt(JsonNode ext) {
		this.ext = ext;
	}

}
