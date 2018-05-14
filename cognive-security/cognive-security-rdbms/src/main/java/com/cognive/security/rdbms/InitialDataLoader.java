package com.cognive.security.rdbms;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.cognive.security.rdbms.entity.PrivilegeEntity;
import com.cognive.security.rdbms.entity.RoleEntity;
import com.cognive.security.rdbms.entity.UserEntity;
import com.cognive.security.rdbms.repo.PrivilegeEntityRepository;
import com.cognive.security.rdbms.repo.RoleEntityRepository;
import com.cognive.security.rdbms.repo.UserEntityRepository;

// @Component
public class InitialDataLoader implements ApplicationListener<ContextRefreshedEvent> {

	boolean alreadySetup = false;

	@Autowired
	private UserEntityRepository userEntityRepository;

	@Autowired
	private RoleEntityRepository roleEntityRepository;

	@Autowired
	private PrivilegeEntityRepository privilegeEntityRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	@Transactional
	public void onApplicationEvent(ContextRefreshedEvent event) {

		if (alreadySetup)
			return;
		PrivilegeEntity readPrivilegeEntity = createPrivilegeEntityIfNotFound("READ_PrivilegeEntity");
		PrivilegeEntity writePrivilegeEntity = createPrivilegeEntityIfNotFound("WRITE_PrivilegeEntity");

		List<PrivilegeEntity> adminPrivilegeEntitys = Arrays.asList(readPrivilegeEntity, writePrivilegeEntity);
		createRoleEntityIfNotFound("RoleEntity_ADMIN", adminPrivilegeEntitys);
		createRoleEntityIfNotFound("RoleEntity_UserEntity", Arrays.asList(readPrivilegeEntity));

		RoleEntity adminRoleEntity = roleEntityRepository.findByName("RoleEntity_ADMIN");
		UserEntity userEntity = new UserEntity();
		userEntity.setFirstName("Test");
		userEntity.setLastName("Test");
		userEntity.setPassword(passwordEncoder.encode("test"));
		userEntity.setEmail("test@test.com");
		userEntity.setRoles(Arrays.asList(adminRoleEntity));
		userEntity.setEnabled(true);
		userEntityRepository.save(userEntity);

		alreadySetup = true;
	}

	@Transactional
	private PrivilegeEntity createPrivilegeEntityIfNotFound(String name) {

		PrivilegeEntity privilegeEntity = privilegeEntityRepository.findByName(name);
		if (privilegeEntity == null) {
			privilegeEntity = new PrivilegeEntity();
			privilegeEntity.setName(name);
			privilegeEntityRepository.save(privilegeEntity);
		}
		return privilegeEntity;
	}

	@Transactional
	private RoleEntity createRoleEntityIfNotFound(String name, Collection<PrivilegeEntity> PrivilegeEntitys) {

		RoleEntity roleEntity = roleEntityRepository.findByName(name);
		if (roleEntity == null) {
			roleEntity = new RoleEntity();
			roleEntity.setName(name);
			roleEntity.setPrivileges(PrivilegeEntitys);
			roleEntityRepository.save(roleEntity);
		}
		return roleEntity;
	}
}
