package com.xadmin.SpringSecurityJWT;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.xadmin.SpringSecurityJWT.entity.User;
import com.xadmin.SpringSecurityJWT.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}

	@Autowired
	private UserRepository repository;
	

	@PostConstruct
	public void initUsers()
	{
		   List<User> users = Stream.of(
	                new User(101, "xadmin", "xadminpassword", "xadmin@gmail.com"),
	                new User(102, "ashish", "ashishpassword", "ashish@gmail.com"),
	                new User(103, "gurpreet", "gurpreetpassword", "gurpreet@gmail.com"),
	                new User(104, "mohit", "mohitpassword", "mohit@gmail.com")
	        ).collect(Collectors.toList());
	        repository.saveAll(users);
	}
}
