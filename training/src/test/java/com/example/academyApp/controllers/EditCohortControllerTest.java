package com.example.academyApp.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.academyApp.models.Cohort;
import com.example.academyApp.services.CohortService;
import com.example.academyApp.services.UserService;

public class EditCohortControllerTest {
	private CohortService cohortService;
	private CohortController cohortController;
	Date startDate = new Date(18 / 07 / 2001);
	Date endDate = new Date(18 / 10 / 2021);
	String location = "ramallah";
	String editedLocation = "jenin";
	Cohort cohort;

	@BeforeEach
	void setUp() {
		cohortService = mock(CohortService.class);
		cohort = new Cohort();
		cohort.setId(3L);
		cohort.setLocation(location);
		when(cohortService.findById(3L)).thenReturn(cohort);

	}

	/* test for editing the location and compare the edited with the old cohort */
	@Test
	public void editCohortLocationTest() {
		cohortController = new CohortController(cohortService);
		Cohort edited = cohortController.edit(3L);
		edited.setLocation(editedLocation);
		assertEquals(edited, cohort);
	}

	/* cohort editing start date test */
	@Test
	public void editCohortStartDateTest() {
		cohortController = new CohortController(cohortService);
		Cohort edited = cohortController.edit(3L);
		edited.setStartDate(startDate);
		assertEquals(edited, cohort);
	}

	/* cohort editing end date test */
	@Test
	public void editCohortEndDateTest() {
		cohortController = new CohortController(cohortService);
		Cohort edited = cohortController.edit(3L);
		edited.setEndDate(endDate);
		assertEquals(edited, cohort);
	}

}
