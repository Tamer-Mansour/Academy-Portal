package com.example.academyApp.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.academyApp.models.Applicant;

public class ApplicantRepositoryTest {
	@Autowired
	private ApplicantRepository applicantRepository;
	Applicant applicant;
	private List<Applicant> applicants = new ArrayList<Applicant>();
	String name = "Rihan";

	@BeforeEach
	void setUp() {
		applicantRepository = mock(ApplicantRepository.class);
		applicant = new Applicant();
		applicant.setName(name);
		applicants.add(applicant);
		when(applicantRepository.findAll()).thenReturn(applicants);
		when(applicantRepository.save(applicant)).thenReturn(applicant);
		when(applicantRepository.findByName(name)).thenReturn(applicant);
	}

	/**
	 * method to test find by name
	 */
	@Test
	void testFindByName() {
		assertEquals(applicant, applicantRepository.findByName(name));
	}

	/**
	 * method to test find all
	 */
	@Test
	void testFindAll() {
		assertEquals(applicants, applicantRepository.findAll());
	}

	/**
	 * method to test save method
	 */
	@Test
	void testSave() {
		assertEquals(applicant, applicantRepository.save(applicant));
	}

}
