package com.cognive.core.model;

import java.util.Map;

public class AppUser {
	private String uid;
	private Map<String, Object> profile;
	
//	private String uid;
//	private String fullName;
//	private boolean isApplication;
//	
//	private String profile;
//	
//	private List<String> roles;
//	private List<String> permissions;	

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Map<String, Object> getProfile() {
		return profile;
	}

	public void setProfile(Map<String, Object> profile) {
		this.profile = profile;
	}
	
}
