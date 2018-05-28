package com.cognive.storage.app.rdbms.entity.common;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.FetchMode;

import com.cognive.storage.rdbms.entity.BaseEntity;

@Entity
@Table(name = "Document")
public class DocumentEntity extends BaseEntity implements Serializable {

	private String documentType;
	private String documentSeries;
	private String documentNumber;
	private Date documentIssueDate;
	private Date expirationDate;
	private String issuer;
	private String issuerCode;
	
	@ManyToOne(optional = false, cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	private PersonEntity owner;

	// add attachment?
	
	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentSeries() {
		return documentSeries;
	}

	public void setDocumentSeries(String documentSeries) {
		this.documentSeries = documentSeries;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public Date getDocumentIssueDate() {
		return documentIssueDate;
	}

	public void setDocumentIssueDate(Date documentIssueDate) {
		this.documentIssueDate = documentIssueDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getIssuerCode() {
		return issuerCode;
	}

	public void setIssuerCode(String issuerCode) {
		this.issuerCode = issuerCode;
	}

	public PersonEntity getOwner() {
		return owner;
	}

	public void setOwner(PersonEntity owner) {
		this.owner = owner;
	}

}
