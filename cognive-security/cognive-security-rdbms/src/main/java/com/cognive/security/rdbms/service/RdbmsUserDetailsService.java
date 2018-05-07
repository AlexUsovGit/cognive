package com.cognive.security.rdbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.cognive.security.rdbms.CgnUserPrincipal;
import com.cognive.security.rdbms.entity.UserEntity;
import com.cognive.security.rdbms.repo.UserRepository;

public class RdbmsUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
 
    @Override
    public UserDetails loadUserByUsername(String username) {
    	UserEntity user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new CgnUserPrincipal(user);
    }

}
