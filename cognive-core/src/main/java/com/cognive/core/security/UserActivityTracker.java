package com.cognive.core.security;

public interface UserActivityTracker {

	public void logActivity(String action);
	
	public void verifyActivity(String action);
	
	public void warnActivity(String action);
	
}
