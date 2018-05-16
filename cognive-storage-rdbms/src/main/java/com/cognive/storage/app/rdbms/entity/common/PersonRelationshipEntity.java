/**
 * 
 */
package com.cognive.storage.app.rdbms.entity.common;

import javax.persistence.Entity;

import com.cognive.storage.rdbms.entity.BaseEntity;

/**
 * @author AndreyGabrinovich
 *
 */
@Entity
public class PersonRelationshipEntity extends BaseEntity {

	private long personFrom;
	private long personTo;
	
	private String kind;
	private String type;
	private String grade;
	
	private String details;

	public long getPersonFrom() {
		return personFrom;
	}

	public void setPersonFrom(long personFrom) {
		this.personFrom = personFrom;
	}

	public long getPersonTo() {
		return personTo;
	}

	public void setPersonTo(long personTo) {
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
