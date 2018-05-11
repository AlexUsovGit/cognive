package com.cognive.core.util;

/**
 * @author AndreyGabrinovich
 *
 */

//@Component
//@Scope(scopeName = "request", proxyMode = ScopedProxyMode.INTERFACES)
public interface ContextHolder<T> {

	// WebApplicationContext.SCOPE_REQUEST
	// @Lookup
	// @EnableAspectJAutoProxy
	
	void set(T item);
	
	T get();
	
	void remove();
	
}
