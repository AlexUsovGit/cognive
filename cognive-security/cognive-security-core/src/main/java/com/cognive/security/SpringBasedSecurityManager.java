package com.cognive.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.cognive.core.model.AppUser;
import com.cognive.core.security.SecurityManager;

public abstract class SpringBasedSecurityManager implements SecurityManager {

	public void get() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	}
	
	public AppUser getTokenInfo(String token) {
		return null;
	}

	public AppUser getCurrentUser() {
		return null;
	}

}
