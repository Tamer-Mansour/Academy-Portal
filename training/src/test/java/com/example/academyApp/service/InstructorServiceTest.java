package com.example.academyApp.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.academyApp.models.Instructor;
import com.example.academyApp.repositories.InstructorRepository;
import com.example.academyApp.services.InstructorService;

public class InstructorServiceTest {
	@Autowired

	private InstructorService instructorService;
	private InstructorRepository instructorRepository;
	Instructor instructor;
	List<Instructor> instructors = new ArrayList<>();
	String name;

	@BeforeEach
	void setUp() {
		instructor = new Instructor();
		name = "Tamer";
		instructor.setName(name);
		instructorRepository = mock(InstructorRepository.class);
		instructorService = new InstructorService(instructorRepository);
		instructors.add(instructor);
		instructorService.saveInstructor(instructor);
		when(instructorService.findAll()).thenReturn(instructors);
		when(instructorRepository.save(instructor)).thenReturn(instructor);
	}

	@Test
	public void testInstructorService() {
		assertNotNull(instructor);

	}

	@Test
	void testFindAll() {
		List<Instructor> instructor = instructorService.findAll();
		assertNotNull(instructor);
	}

	@Test
	void testFindByName() {
		assertEquals(name, instructor.getName());
	}
}
