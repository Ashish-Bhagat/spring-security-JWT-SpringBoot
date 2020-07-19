package com.xadmin.SpringSecurityJWT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xadmin.SpringSecurityJWT.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserName(String username);

}
