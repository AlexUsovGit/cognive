/**
 * 
 */
package com.cognive.storage.app.rdbms.entity.common;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.cognive.core.model.common.Person;
import com.cognive.storage.rdbms.entity.BaseEntity;

/**
 * @author AndreyGabrinovich
 *
 */
@Entity
@IdClass(PersonRelationshipId.class)
public class PersonRelationshipEntity extends BaseEntity {

	@Column(name = "PERSON_FROM_ID")
	private Long personFromId;
	@Column(name = "PERSON_TO_ID")
	private Long personToId;
	
	@ManyToOne
	@JoinColumn(name = "PERSON_FROM_ID", referencedColumnName = "id")
	private Person personFrom;
	@ManyToOne
	@JoinColumn(name = "PERSON_TO_ID", referencedColumnName = "id")
	private Person personTo;
	
	private String kind;
	private String type;
	private String grade;
	
	private String details;

	public Long getPersonFromId() {
		return personFromId;
	}

	public void setPersonFromId(Long personFromId) {
		this.personFromId = personFromId;
	}

	public Long getPersonToId() {
		return personToId;
	}

	public void setPersonToId(Long personToId) {
		this.personToId = personToId;
	}

	public Person getPersonFrom() {
		return personFrom;
	}

	public void setPersonFrom(Person personFrom) {
		this.personFrom = personFrom;
	}

	public Person getPersonTo() {
		return personTo;
	}

	public void setPersonTo(Person personTo) {
		this.personTo = personTo;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
