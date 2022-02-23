package com.example.academyApp.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.academyApp.models.Applicant;
import com.example.academyApp.repositories.ApplicantRepository;

public class ApplicantServiceTest {
	@Autowired
	private ApplicantRepository applicantRepository;
	private StudentService studentService;
	private ApplicantService applicantService;
	Applicant applicant;
	String name = "Rihan";
	Long id = 3L;
	List<Applicant> applicants = new ArrayList<Applicant>();

	@BeforeEach
	void setUp() {
		applicant = new Applicant();
		applicant.setName(name);
		applicant.setPersonalId(id);
		applicants.add(applicant);
		applicantRepository = mock(ApplicantRepository.class);
		applicantService = new ApplicantService(applicantRepository,studentService);
		when(applicantService.findAll()).thenReturn(applicants);
		when(applicantService.save(applicant)).thenReturn(applicant);

	}

	/**
	 * method to test find all applicants
	 */

	@Test
	void testFindAll() {
		assertEquals(applicants.size(), applicantService.findAll().size());
	}

	/**
	 * method to test save applicant
	 */

	@Test
	void testSave() {
		assertEquals(name, applicantService.save(applicant).getName());
		assertEquals(id, applicantService.save(applicant).getPersonalId());

	}

}
