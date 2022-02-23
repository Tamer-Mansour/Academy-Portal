package com.example.academyApp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.academyApp.models.Instructor;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor, Long> {
	List<Instructor> findAll();

	Instructor findByName(String name);
}
