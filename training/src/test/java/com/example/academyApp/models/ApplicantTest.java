package com.example.academyApp.models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.academyApp.models.enums.ApplicantStatus;
import com.example.academyApp.models.enums.Gender;

class ApplicantTest {
	Applicant applicant;
	String name = "Rihan";
	String phoneNumber = "123";
	String email = "applicant@gmail.com";
	Date dateOfBirth = new Date();
	Gender gender = Gender.FEMALE;
	String city = "jerusalem";
	String educationalBackground = "phd";
	Cohort cohort = new Cohort();
	ApplicantStatus status = ApplicantStatus.ACCEPTED;
	Student student;

	@BeforeEach
	void setUp() {
		applicant = new Applicant();

	}

	/**
	 * method to test creating applicant
	 */
	@Test
	void testApplicantObject() {
		assertNotNull(applicant);
	}

	/**
	 * method to test setter and getter for name field
	 */
	@Test
	void testApplicantName() {
		applicant.setName(name);
		assertEquals(name, applicant.getName());
	}

	/**
	 * method to test setter and getter for phone number field
	 */
	@Test
	void testApplicantPhoneNumber() {
		applicant.setPhoneNumber(phoneNumber);
		assertEquals(phoneNumber, applicant.getPhoneNumber());
	}

	/**
	 * method to test setter and getter for date of birth field
	 */
	@Test
	void testApplicantDateOfBirth() {
		applicant.setDateOfBirth(dateOfBirth);
		assertEquals(dateOfBirth, applicant.getDateOfBirth());
	}

	/**
	 * method to test setter and getter for gender field
	 */
	@Test
	void testApplicantGender() {
		applicant.setGender(gender);
		assertEquals(gender, applicant.getGender());
	}

	/**
	 * method to test setter and getter for city field
	 */
	@Test
	void testApplicantCity() {
		applicant.setCity(city);
		assertEquals(city, applicant.getCity());
	}

	/**
	 * method to test setter and getter for educational background field
	 */
	@Test
	void testApplicantEducationalBackground() {
		applicant.setEducationalBackground(educationalBackground);
		assertEquals(educationalBackground, applicant.getEducationalBackground());
	}

	/**
	 * method to test setter and getter for cohort field
	 */
	@Test
	void testApplicantCohort() {
		applicant.setCohort(cohort);
		;
		assertEquals(cohort, applicant.getCohort());
	}

	/**
	 * method to test setter and getter for status field
	 */
	@Test
	void testApplicantStatus() {
		applicant.setStatus(status);
		assertEquals(status, applicant.getStatus());
	}

}
