package com.cognive.core.model.business;

import java.util.List;

import com.cognive.core.model.common.Person;
import com.cognive.core.model.common.PersonRelationship;

public class IndividualCommonApplication extends BaseApplication {

	private Person individual;

	private String reputation;
	private String financialStatus;

	private int sourceOfFounds;
	private String sourceOfFoundsOther;

	private int relationshipWithBank;
	private String relationshipWithBankOther;

	private List<PersonRelationship> beneficiaries;
	private List<PersonRelationship> publicOfficials;
	private List<PersonRelationship> foreignPublicOfficials;

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

	public List<PersonRelationship> getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(List<PersonRelationship> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}

	public List<PersonRelationship> getPublicOfficials() {
		return publicOfficials;
	}

	public void setPublicOfficials(List<PersonRelationship> publicOfficials) {
		this.publicOfficials = publicOfficials;
	}

	public List<PersonRelationship> getForeignPublicOfficials() {
		return foreignPublicOfficials;
	}

	public void setForeignPublicOfficials(List<PersonRelationship> foreignPublicOfficials) {
		this.foreignPublicOfficials = foreignPublicOfficials;
	}

}
