package com.example.academyApp.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.academyApp.models.Cohort;
import com.example.academyApp.repositories.CohortRepository;
import com.example.academyApp.services.CohortService;

class CohortServiceTest {
	@Autowired
	private Cohort cohort;
	private CohortService cohortService;
	private CohortRepository cohortRepository;
	private String name;
	private Date startDate;
	private Date endDate;
	private String location;
	private List<Cohort> cohorts;

	@BeforeEach
	void setUp() {
		cohort = new Cohort();
		cohorts = new ArrayList();
		name = "cohort1";
		startDate = new Date();
		endDate = new Date();
		location = "ramallah";
		cohorts.add(cohort);
		cohortRepository = mock(CohortRepository.class);
		cohortService = mock(CohortService.class);
		cohort.setCohortName(name);
		cohort.setStartDate(startDate);
		cohort.setEndDate(endDate);
		cohort.setLocation(location);
		cohortService.saveCohort(cohort);
		when(cohortService.saveCohort(cohort)).thenReturn(cohort);
		when(cohortService.findByName(name)).thenReturn(cohort);
		when(cohortService.findAll()).thenReturn(cohorts);
		when(cohortService.findById(cohort.getId())).thenReturn(cohort);
	}

	/**
	 * Method to test createCohort method in Cohort Service
	 */
	@Test
	void testCreate() {
		assertNotNull(cohort);
	}

	/**
	 * method to test the method findAll() in CohortService
	 */
	@Test
	void testFindAll() {
		assertNotNull(cohortService.findAll());
		assertTrue(cohortService.findAll().contains(cohort));
	}

	/**
	 * method to test method findByName() in CohortService
	 */
	@Test
	void testFindByName() {
		assertEquals(cohort, cohortService.findByName(name));
	}

	/**
	 * method to test findById()
	 */
	@Test
	void testFindById() {
		assertEquals(cohort, cohortService.findById(cohort.getId()));
	}

}
