package com.example.academyApp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.academyApp.models.Interview;
import com.example.academyApp.models.Student;

@Repository
public interface InterviewRepository extends CrudRepository<Interview, Long> {
	List<Interview> findAll();

	Interview findByName(String name);

	/* to get students all interviews */
	List<Interview> findByStudent(Student student);
}
