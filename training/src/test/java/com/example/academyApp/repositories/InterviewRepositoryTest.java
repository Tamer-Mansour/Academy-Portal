package com.example.academyApp.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.academyApp.models.Interview;

public class InterviewRepositoryTest {
	private InterviewRepository interviewRepository;
	Interview interview;
	List<Interview> interviews = new ArrayList<>();

	@BeforeEach
	void setUp() {
		interview = new Interview();
		String name = "interviewpart1";
		interview.setName(name);
		interviews.add(interview);
		interviewRepository = mock(InterviewRepository.class);
		interviews.add(interview);
		when(interviewRepository.findAll()).thenReturn(interviews);
		when(interviewRepository.save(interview)).thenReturn(interview);
	}

	@Test
	public void testCohortRepository() {
		assertNotNull(interviewRepository.save(interview));
		assertEquals(interviews, interviewRepository.findAll());
	}
}
