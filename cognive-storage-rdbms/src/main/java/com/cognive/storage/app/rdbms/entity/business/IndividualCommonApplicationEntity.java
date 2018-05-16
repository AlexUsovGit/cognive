package com.cognive.storage.app.rdbms.entity.business;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cognive.core.model.common.Person;
import com.cognive.storage.app.rdbms.entity.common.PersonRelationshipEntity;

@Entity
public class IndividualCommonApplicationEntity extends BaseApplicationEntity {

	public final static String ATTACHMENT_KIND = "ind_app";

	private Person individual;

	private String reputation;
	private String financialStatus;

	private int sourceOfFounds;
	private String sourceOfFoundsOther;

	private int relationshipWithBank;
	private String relationshipWithBankOther;

	private List<PersonRelationshipEntity> beneficiaries;

	private List<PersonRelationshipEntity> publicOfficials;
	private List<PersonRelationshipEntity> foreignPublicOfficials;

	public Person getIndividual() {
		return individual;
	}

	public void setIndividual(Person individual) {
		this.individual = individual;
	}

	public String getReputation() {
		return reputation;
	}

	public void setReputation(String reputation) {
		this.reputation = reputation;
	}

	public String getFinancialStatus() {
		return financialStatus;
	}

	public void setFinancialStatus(String financialStatus) {
		this.financialStatus = financialStatus;
	}

	public int getSourceOfFounds() {
		return sourceOfFounds;
	}

	public void setSourceOfFounds(int sourceOfFounds) {
		this.sourceOfFounds = sourceOfFounds;
	}

	public String getSourceOfFoundsOther() {
		return sourceOfFoundsOther;
	}

	public void setSourceOfFoundsOther(String sourceOfFoundsOther) {
		this.sourceOfFoundsOther = sourceOfFoundsOther;
	}

	public int getRelationshipWithBank() {
		return relationshipWithBank;
	}

	public void setRelationshipWithBank(int relationshipWithBank) {
		this.relationshipWithBank = relationshipWithBank;
	}

	public String getRelationshipWithBankOther() {
		return relationshipWithBankOther;
	}

	public void setRelationshipWithBankOther(String relationshipWithBankOther) {
		this.relationshipWithBankOther = relationshipWithBankOther;
	}

	public List<PersonRelationshipEntity> getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(List<PersonRelationshipEntity> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}

	public List<PersonRelationshipEntity> getPublicOfficials() {
		return publicOfficials;
	}

	public void setPublicOfficials(List<PersonRelationshipEntity> publicOfficials) {
		this.publicOfficials = publicOfficials;
	}

	public List<PersonRelationshipEntity> getForeignPublicOfficials() {
		return foreignPublicOfficials;
	}

	public void setForeignPublicOfficials(List<PersonRelationshipEntity> foreignPublicOfficials) {
		this.foreignPublicOfficials = foreignPublicOfficials;
	}

}
