package com.cognive.app.base.rest.model.messages;

public enum AppMessageCode {
	
	REQUEST_PROCESSED("common", "2000");
	
	private String packageName;
	private String code;

	private AppMessageCode(String packageName, String i) {
		this.packageName = packageName;
		this.code = i;
	}

	public String getCode() {
		return this.code;
	}
	
	public String getPackageName() {
		return this.packageName;
	}
}
