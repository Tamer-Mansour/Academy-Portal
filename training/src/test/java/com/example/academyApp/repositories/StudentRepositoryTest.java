package com.example.academyApp.repositories;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.academyApp.models.Student;

public class StudentRepositoryTest {
	@Autowired
	private StudentRepository studentRepository;
	Student student;
	List<Student> students = new ArrayList<>();
	String name;

	@BeforeEach
	public void setUp() {
		student = new Student();
		name = "Tamer";
		student.setName(name);
		studentRepository = mock(StudentRepository.class);
		students.add(student);
		when(studentRepository.findAll()).thenReturn(students);
		when(studentRepository.save(student)).thenReturn(student);
	}

	@Test
	public void testSaveStudentRepository() {
		assertNotNull(studentRepository.save(student));
	}

	@Test
	public void testFindAll() {
		assertEquals(students, studentRepository.findAll());
	}

	@Test
	public void testFindByName() {
		assertNull(studentRepository.findByName(name));
	}
}
