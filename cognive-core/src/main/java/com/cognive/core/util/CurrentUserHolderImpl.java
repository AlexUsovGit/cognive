package com.cognive.core.util;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.cognive.core.security.User;

/**
 * @author AndreyGabrinovich
 *
 */

@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class CurrentUserHolderImpl implements CurrentUserHolder {
	
	private User user;

	@Override
	public void set(User item) {
		user = item;
	}

	@Override
	public User get() {
		return user;
	}

	@Override
	public void remove() {
		user = null;
	}
	
}
