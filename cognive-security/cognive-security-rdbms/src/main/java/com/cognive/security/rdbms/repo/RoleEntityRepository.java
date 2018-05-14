package com.cognive.security.rdbms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognive.security.rdbms.entity.RoleEntity;

public interface RoleEntityRepository extends JpaRepository<RoleEntity, Long>{

	RoleEntity findByName(String name);

}
