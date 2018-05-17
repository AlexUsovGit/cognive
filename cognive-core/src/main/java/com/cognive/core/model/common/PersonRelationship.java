/**
 * 
 */
package com.cognive.core.model.common;

import java.util.List;

import com.cognive.core.model.base.BaseBusinessObject;

/**
 * @author AndreyGabrinovich
 *
 */

public class PersonRelationship extends BaseBusinessObject {

	private long personFromId;
	private long personToId;
	
	private Person personFrom;
	private Person personTo;
	
	private String kind;
	private String type;
	private String grade;
	
	private String details;

	public long getPersonFromId() {
		return personFromId;
	}

	public void setPersonFromId(long personFromId) {
		this.personFromId = personFromId;
	}

	public long getPersonToId() {
		return personToId;
	}

	public void setPersonToId(long personToId) {
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
