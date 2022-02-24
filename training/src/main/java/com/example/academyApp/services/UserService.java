package com.example.academyApp.services;

import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.academyApp.models.User;
import com.example.academyApp.repositories.RoleRepository;
import com.example.academyApp.repositories.UserRepository;

@Service
@CrossOrigin(origins = "http://localhost:3000")
public class UserService {
	final UserRepository userRepo;
	final RoleRepository roleRepo;
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public UserService(UserRepository userRepo, RoleRepository roleRepo, BCryptPasswordEncoder bCryptPasswordEncoder) {
		super();
		this.userRepo = userRepo;
		this.roleRepo = roleRepo;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	public User findByEmail(String email) {
		return userRepo.findUserByEmail(email);
	}

	// this method is temp to add one admin to logIn
	public void setAdmin() {
		User user = new User();
		user.setName("admin");
		user.setEmail("admin@gmail.com");
		user.setPassword("admin");
		user.setPasswordConfirmation("admin");
		user.setRoles(roleRepo.findByName("ROLE_ADMIN"));
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userRepo.save(user);
	}

	public List<User> findAllUsers() {
		return userRepo.findAll();
	}
}
