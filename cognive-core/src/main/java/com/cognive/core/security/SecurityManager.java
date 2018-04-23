/**
 * 
 */
package com.cognive.core.security;

import com.cognive.core.model.AppUser;

/**
 * @author 1
 *
 */
public interface SecurityManager {

	public AppUser getTokenInfo(String token);

	public AppUser getCurrentUser();
	
}
