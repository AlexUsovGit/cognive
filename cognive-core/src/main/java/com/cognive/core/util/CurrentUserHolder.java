package com.cognive.core.util;

import com.cognive.core.security.User;

/**
 * @author AndreyGabrinovich
 *
 */

//@Component
//@Scope(scopeName = "request", proxyMode = ScopedProxyMode.INTERFACES)
public interface CurrentUserHolder extends ContextHolder<User> {
	
	// after springboot integration move to config
	
}
