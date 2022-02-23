package com.example.academyApp.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.academyApp.models.Cohort;
import com.example.academyApp.models.Student;
import com.example.academyApp.models.User;
import com.example.academyApp.services.CohortService;
import com.example.academyApp.services.StudentService;
import com.example.academyApp.services.UserService;

public class EditSudentDetailsTest {
	private StudentService studentService;
	private StudentController studentController;
	private CohortService cohortService;
	String phoneNumber = "0522185867";
	String emergencyContact = "0568172587";
	User instructor;
	Date dateOfBirth = new Date(18 / 12 / 2005);
	Date startDate = new Date(1 / 9 / 2021);
	Date endDate = new Date(30 / 3 / 2022);
	Cohort cohort = new Cohort(startDate, endDate, emergencyContact);
	String location = "ramallah";
	String editedLocation = "jenin";
	String name = "Sameer";
	String editedName = "Samera";

	@BeforeEach
	void setUp() {
		studentService = mock(StudentService.class);
		Student student = new Student();
		student.setName(name);
		student.setPersonalId(7);
		student.setCohort(cohort);
		when(studentService.findById(7L)).thenReturn(student);
//		studentController = new StudentController(studentService, cohortService);

	}

	@Test
	public void testEditStudentDetails() {

		Student student = studentController.edit(7L);
		student.setName(editedName);
		assertEquals(editedName, student.getName());
	}

}
