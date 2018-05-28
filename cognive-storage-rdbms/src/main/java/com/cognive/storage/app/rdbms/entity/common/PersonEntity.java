package com.cognive.storage.app.rdbms.entity.common;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.cognive.storage.rdbms.entity.BaseModifiableEntity;

@Entity
@Table(name="Person")
@NamedEntityGraph(name="fullPersonEntity",
		attributeNodes = {
				@NamedAttributeNode(value = "documents"),
				@NamedAttributeNode(value = "registrationAddress"),
				@NamedAttributeNode(value = "residenceAddress"),
				@NamedAttributeNode(value = "postalAddress"),
				@NamedAttributeNode(value = "phoneNumbers")
				})
public class PersonEntity extends BaseModifiableEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1108007264533437709L;
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	private Date birthDate;
	private String birthPlace;
	private String birthCountry; // Code
	private String citizenshipCountry; // Code
	
	// remake -> List + address type
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="registrationAddress")
	private AddressEntity registrationAddress;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.MERGE)
	@JoinColumn(name="residenceAddressId")
	private AddressEntity residenceAddress;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="postalAddressId")
	private AddressEntity postalAddress; // postalAddress

	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinTable(
			name = "person_phone",
			joinColumns = @JoinColumn(name="person_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name="phone_id", referencedColumnName = "id")
			)
	private List<PhoneNumberEntity> phoneNumbers;
	
	private String taxIdentificationNumber; // inn
	private String socialSecurityNumber; // snils;
	private String email;

	@OneToMany(mappedBy="owner", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<DocumentEntity> documents;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getBirthCountry() {
		return birthCountry;
	}

	public void setBirthCountry(String birthCountry) {
		this.birthCountry = birthCountry;
	}

	public String getCitizenshipCountry() {
		return citizenshipCountry;
	}

	public void setCitizenshipCountry(String citizenshipCountry) {
		this.citizenshipCountry = citizenshipCountry;
	}

	public AddressEntity getRegistrationAddress() {
		return registrationAddress;
	}

	public void setRegistrationAddress(AddressEntity registrationAddress) {
		this.registrationAddress = registrationAddress;
	}

	public AddressEntity getResidenceAddress() {
		return residenceAddress;
	}

	public void setResidenceAddress(AddressEntity residenceAddress) {
		this.residenceAddress = residenceAddress;
	}

	public AddressEntity getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(AddressEntity postalAddress) {
		this.postalAddress = postalAddress;
	}

	public List<PhoneNumberEntity> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumberEntity> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}

	public void setTaxIdentificationNumber(String taxIdentificationNumber) {
		this.taxIdentificationNumber = taxIdentificationNumber;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<DocumentEntity> getDocuments() {
		return documents;
	}

	public void setDocuments(List<DocumentEntity> documents) {
		this.documents = documents;
	} 
	
}
