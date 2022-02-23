package com.example.academyApp.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.academyApp.repositories.InstructorRepository;

import com.example.academyApp.models.Instructor;

class InstructorRepositoryTest {
	@Autowired
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
		instructors.add(instructor);
		when(instructorRepository.findAll()).thenReturn(instructors);
		when(instructorRepository.save(instructor)).thenReturn(instructor);
	}

	@Test
	public void testSaveInstructorRepository() {
		assertNotNull(instructorRepository.save(instructor));
	}

	@Test
	public void testFindAll() {
		assertEquals(instructors, instructorRepository.findAll());
	}

	public void testFindByName() {
		assertNull(instructorRepository.findByName(name));
	}
}
