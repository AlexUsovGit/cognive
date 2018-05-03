package com.cognive.core.model;

import com.cognive.core.model.base.BaseModifiableBusinessObject;
import com.fasterxml.jackson.databind.JsonNode;

public class BasicBo extends BaseModifiableBusinessObject {

	private String value;
	private JsonNode ext;

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
