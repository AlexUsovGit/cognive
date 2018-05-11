package com.cognive.security.rdbms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognive.security.rdbms.entity.UserEntity;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {

}
