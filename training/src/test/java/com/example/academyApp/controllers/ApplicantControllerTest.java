package com.example.academyApp.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.academyApp.models.Applicant;
import com.example.academyApp.services.ApplicantService;

public class ApplicantControllerTest {
	@Autowired
	private ApplicantService applicantService;
	private ApplicantController applicantController;
	private Applicant applicant;
	private List<Applicant> applicants = new ArrayList<Applicant>();
	private Long id = 2L;

	@BeforeEach
	void setUp() {
		applicantService = mock(ApplicantService.class);
		applicant = new Applicant();
		applicant.setPersonalId(id);
		applicants.add(applicant);
		applicantController = new ApplicantController(applicantService);
		when(applicantController.applicantDetails(id)).thenReturn(applicant);
		when(applicantController.listAllApplicants()).thenReturn(applicants);

	}

	/**
	 * method to test the method that shows applicant details
	 */
	@Test
	void testapplicantDetails() {
		assertEquals(applicant, applicantController.applicantDetails(id));
	}

	/**
	 * method to test get all applicants
	 */
	@Test
	void testGetAllApplicants() {
		assertEquals(applicants, applicantController.listAllApplicants());
	}

}
