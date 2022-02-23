package com.example.academyApp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.academyApp.models.Instructor;
import com.example.academyApp.repositories.InstructorRepository;

@Service
public class InstructorService {
	public InstructorRepository instructorRepository;

	public InstructorService(InstructorRepository instructorRepository) {
		this.instructorRepository = instructorRepository;
	}

	/**
	 * method to find all instructors
	 */
	public List<Instructor> findAll() {
		return instructorRepository.findAll();
	}

	/**
	 * method to find by name
	 * 
	 * @param name
	 * @return instructor if found, null if not
	 */
	public Instructor findByName(String name) {
		return instructorRepository.findByName(name);
	}

	/**
	 * method to save instructor
	 * 
	 * @param instructor
	 */
	public void saveInstructor(Instructor instructor) {
		instructorRepository.save(instructor);
	}

}
