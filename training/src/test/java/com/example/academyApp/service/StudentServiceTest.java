package com.example.academyApp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.academyApp.models.Cohort;
import com.example.academyApp.models.Student;
import com.example.academyApp.repositories.StudentRepository;
import com.example.academyApp.services.StudentService;

class StudentServiceTest {
	@Autowired
	private StudentRepository studentRepository;
	private StudentService studentService;
	Student student;
	Cohort cohort = new Cohort();
	List<Student> students = new ArrayList<>();
	String name;

	@BeforeEach
	void setUp() {
		student = new Student();
		name = "Tamer";
		student.setName(name);
		student.setCohort(cohort);
		studentRepository = mock(StudentRepository.class);
		studentService = new StudentService(studentRepository);
		students.add(student);
		cohort.setStudents(students);
		studentService.saveStudent(student);
		when(studentService.findAll()).thenReturn(students);
		when(studentRepository.save(student)).thenReturn(student);
	}
/**
 * method to test the method to find all students
 */
	@Test
	public void testFindAll() {
		List<Student> students= studentService.findAll(); 
		assertNotNull(students);
	}
/**
 * method to test find by name method
 */
	@Test
	public void testFindByName() {
		assertEquals(name, student.getName());
	}

}
