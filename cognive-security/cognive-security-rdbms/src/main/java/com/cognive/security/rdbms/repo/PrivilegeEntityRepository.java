package com.cognive.security.rdbms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognive.security.rdbms.entity.PrivilegeEntity;

public interface PrivilegeEntityRepository extends JpaRepository<PrivilegeEntity, Long> {

	PrivilegeEntity findByName(String name);

}
