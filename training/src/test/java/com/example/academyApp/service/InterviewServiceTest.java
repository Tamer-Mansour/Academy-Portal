package com.example.academyApp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.academyApp.models.Interview;
import com.example.academyApp.models.Question;
import com.example.academyApp.models.enums.InterviewType;
import com.example.academyApp.models.Interview.Grade;
import com.example.academyApp.repositories.InterviewRepository;
import com.example.academyApp.services.InterviewService;

public class InterviewServiceTest {
	@Autowired
	private Interview interview;
	private InterviewRepository interviewRepository;
	private InterviewService interviewService;
	private InterviewType type;
	private String name;
	private Date date;
	private String interviewer;
	private List<Question> questions;
	private String loction;
	private Grade grade;
	private String generalNotes;

	@BeforeEach
	void setUp() {
		interview = new Interview();
		questions = new ArrayList();
		name = "interview1";
		date = new Date();
		interviewer = "Waleed";
		loction = "Nablus";
		generalNotes = "The student is";
		interviewRepository = mock(InterviewRepository.class);
		interviewService = mock(InterviewService.class);
		interview.setType(type);
		interview.setName(name);
		interview.setDate(date);
		interview.setInterviewer(interviewer);
		interview.setLocation(loction);
		interview.setGrade(grade);
		interview.setGeneralNotes(generalNotes);
		interviewService.createInterview(interview);
		when(interviewService.createInterview(interview)).thenReturn(interview);
		when(interviewService.findByName(name)).thenReturn(interview);
//		when(interviewService.findAll()).thenReturn(interview);
		when(interviewService.findById(interview.getId())).thenReturn(interview);
	}

	@Test
	void testCreate() {
		assertNotNull(interview);
	}

	@Test
	void testFindAll() {
		List<Interview> interview = interviewService.findAll();
		assertNotNull(interview);
	}

	@Test
	void testFindByName() {
		assertEquals(name, interview.getName());
	}
}
