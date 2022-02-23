package com.example.academyApp.models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.academyApp.models.Cohort;

class CohortTest {
	public Cohort cohort;

	Date startDate = new Date(18 / 07 / 2001);
	Date EndDate = new Date(18 / 10 / 2021);

	@BeforeEach
	public void setUp() throws Exception {
		cohort = new Cohort();
	}

	@Test
	public void test() {
		assertNotNull(cohort);
	}

	@Test
	public void testLocation() {
		cohort.setLocation("ramallah");
		assertEquals("ramallah", cohort.getLocation());
	}

	@Test
	public void testSartDate() {
		cohort.setStartDate(startDate);
		assertEquals(startDate, cohort.getStartDate());
	}

	@Test
	public void testEndDate() {
		cohort.setEndDate(EndDate);
		assertEquals(EndDate, cohort.getEndDate());
	}

	@Test
	public void testCohortName() {
		cohort.setCohortName("cohort" + cohort.getId());
		assertEquals("cohort" + cohort.getId(), cohort.getCohortName());
	}
}
