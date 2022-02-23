package com.example.academyApp.repositories;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.academyApp.models.Cohort;
import com.example.academyApp.repositories.CohortRepository;

class CohortRepoTest {

	private CohortRepository cohortRepository;
	Cohort cohort;
	List<Cohort> cohorts = new ArrayList<>();

	@BeforeEach
	void setUp() {
		cohort = new Cohort();
		String name = "cohprt1";
		cohort.setCohortName(name);
		cohortRepository = mock(CohortRepository.class);
		cohorts.add(cohort);
		when(cohortRepository.findAll()).thenReturn(cohorts);
		when(cohortRepository.save(cohort)).thenReturn(cohort);

	}

	@Test
	public void testCohortRepository() {
		assertNotNull(cohortRepository.save(cohort));
		assertEquals(cohorts, cohortRepository.findAll());
	}
}
