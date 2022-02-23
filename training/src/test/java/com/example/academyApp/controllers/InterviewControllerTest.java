package com.example.academyApp.controllers;

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
import com.example.academyApp.services.InterviewService;

public class InterviewControllerTest {
	@Autowired
	InterviewService interviewService;
	Interview interview;
	private String name = "firstInterview";
	private Date date = new Date(11 / 9 / 1996);
	private String interviewer = "Waleed";
	private List<Question> questions;
	InterviewController interviewController;

	@BeforeEach
	void setUp() {

		interviewService = mock(InterviewService.class);
		interviewController = new InterviewController(interviewService);
		interview = new Interview();
		interview.setName(name);
		interview.setDate(date);
		interview.setInterviewer(interviewer);
		questions = new ArrayList<>();
		questions.add(new Question("q1", "a1", "n1"));
		interview.setQuestions(questions);
		when(interviewService.createInterview(interview)).thenReturn(interview);

	}

	/* test for add interview api */
	@Test
	public void addNewInterviewTest() {
		Interview newInterview = interviewController.create(interview);
		assertNotNull(interviewController.create(newInterview));
		assertEquals(newInterview, interview);
	}

	@Test
	public void getInterviewFullDetailsTest() {
		Interview interview = interviewController.showInterviewDetails(1L);
		Interview expectedInterview = interviewService.findById(1L);
		assertEquals(interview, expectedInterview);
	}

}
