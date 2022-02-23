package com.example.academyApp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.academyApp.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findUserByEmail(String email);

	List<User> findAll();
}
