package com.example.academyApp.models;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.academyApp.models.enums.StudentStatus;

class StudentTest {
	Student student;

	@BeforeEach
	void setUp() {
		student = new Student();
	}

	@Test
	void testStudentObject() {
		assertNotNull(student);
	}

	@Test
	void testPhoneNumber() {
		String phoneNumber = "123456";
		student.setPhoneNumber(phoneNumber);
		assertEquals(phoneNumber, student.getPhoneNumber());
	}

	@Test
	void testEducationalBackground() {
		String educationalBackgroung = "high school";
		student.setEducationalBackground(educationalBackgroung);
		assertEquals(educationalBackgroung, student.getEducationalBackground());
	}

	@Test
	void testEmergencyContact() {
		String emergencyContact = "051234";
		student.setEmergencyContact(emergencyContact);
		assertEquals(emergencyContact, student.getEmergencyContact());
	}

	@Test
	void testAllergyAndDiet() {
		String allergyAndDiet = "none";
		student.setAllergyAndDiet(allergyAndDiet);
		assertEquals("none", student.getAllergyAndDiet());
	}

	@Test
	void testNotes() {
		String notes = "No";
		student.setNotes(notes);
		assertEquals(notes, student.getNotes());
	}

	@Test
	void testStatus() {
		student.setStatus(StudentStatus.HIRED);
		assertEquals(StudentStatus.HIRED, student.getStatus());
	}

	@Test
	void testDateOfBirth() {
		Date dateOfBirth = new Date(11 / 9 / 1996);
		student.setDateOfBirth(dateOfBirth);
		assertEquals(dateOfBirth, student.getDateOfBirth());

	}

}
