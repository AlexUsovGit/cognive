package com.cognive.security.rdbms.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "authorities")
public class Authority {

	Long userId; 
	private String authority;
	
}
