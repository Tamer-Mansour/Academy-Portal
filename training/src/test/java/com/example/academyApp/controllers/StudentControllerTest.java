package com.example.academyApp.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.academyApp.models.Interview;

import com.example.academyApp.models.Student;
import com.example.academyApp.models.enums.InterviewType;
import com.example.academyApp.services.CohortService;
import com.example.academyApp.services.InterviewService;
import com.example.academyApp.services.StudentService;
import com.example.academyApp.services.UserService;

public class StudentControllerTest {

	private StudentService studentService;
	private InterviewService interviewService;
	private StudentController studentController;
	String email = "tam@man.co";
	Long id = (12L);
	List<Student> students = new ArrayList<>();
	Student std;

	@BeforeEach
	void muckSe() {
		studentService = mock(StudentService.class);
		std= new Student();
		std.setPersonalId(id);
		std.setEmail(email);
		students.add(std);
		
		when(studentService.findById(12L)).thenReturn(std);
		interviewService = mock(InterviewService.class);
		studentController = new StudentController(studentService, interviewService);
		when(studentService.findAll()).thenReturn(students);
		
	}

	@Test
	public void studentDetailsTest() {
		Student result = studentController.studentDetails(12L);

		Student expected = new Student();
		expected.setPersonalId(id);
		expected.setEmail(email);

		assertEquals(result.getPersonalId(), expected.getPersonalId());
		assertEquals(result.getEmail(), expected.getEmail());
	}

	/*
	 * Simple test to make sure api works and not null after checking it on postman
	 */
	@Test
	public void addInterviewTest() {
		Interview interview = studentController.getInterview(0, 3L);
		Interview expected = new Interview();
		expected.setType(InterviewType.TECHNICAL);
		assertNotNull(interview);
		assertEquals(interview.getType(), expected.getType());
	}

	/*
	 * test to make sure the returned list form api is the same list for given
	 * student
	 */
	@Test
	public void getInterviewDetailsTest() {
		Student student = new Student();
		student.setPersonalId(id);
		List<Interview> interviews = studentController.showInterview(id);
		student.setInterviews(interviews);
		assertNotNull(interviews);
		assertEquals(interviews, student.getInterviews());
	}
	@Test 
	public void testAddStudent() {
		studentController.addStudent(std); 
		assertTrue(students.contains(std));
	}

}
