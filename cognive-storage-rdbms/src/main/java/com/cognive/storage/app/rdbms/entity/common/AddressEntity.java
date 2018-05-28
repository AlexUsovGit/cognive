package com.cognive.storage.app.rdbms.entity.common;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cognive.storage.rdbms.entity.BaseEntity;

@Entity
@Table(name = "Address")
public class AddressEntity extends BaseEntity implements Serializable {

	private String postCode;
	private String countryCode;
	private String state;
	private String region;
	private String city;
	private String street;
	private String building;
	private String room;
	private String extraString;

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getExtraString() {
		return extraString;
	}

	public void setExtraString(String extraString) {
		this.extraString = extraString;
	}

}
