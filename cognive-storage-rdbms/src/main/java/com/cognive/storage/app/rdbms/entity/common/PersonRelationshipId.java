package com.cognive.storage.app.rdbms.entity.common;

import java.io.Serializable;

public class PersonRelationshipId implements Serializable {
	private Long personFromId;
	private Long personToId;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((personFromId == null) ? 0 : personFromId.hashCode());
		result = prime * result + ((personToId == null) ? 0 : personToId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonRelationshipId other = (PersonRelationshipId) obj;
		if (personFromId == null) {
			if (other.personFromId != null)
				return false;
		} else if (!personFromId.equals(other.personFromId))
			return false;
		if (personToId == null) {
			if (other.personToId != null)
				return false;
		} else if (!personToId.equals(other.personToId))
			return false;
		return true;
	}

}
