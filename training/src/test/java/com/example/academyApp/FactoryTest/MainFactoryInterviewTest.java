package com.example.academyApp.FactoryTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.academyApp.factory.MainFactoryInterview;
import com.example.academyApp.models.Interview;
import com.example.academyApp.models.enums.InterviewType;

public class MainFactoryInterviewTest {
	Interview interview;
	String OneToOneDiscussionQuestion = "Things to discuss during the \r\n" + "meeting\r\n"
			+ "(what do you want to discuss in \r\n" + "the meeting, points you want to \r\n" + "follow on)\r\n" + "";
	String personalQuestion = "Tell us more about yourself?";
	String goalsQuestion = "What are your future goals?";
	String firstInterviewMotives = "Why do you want to join the Academy?";
	String firstInterviewExpectations = "What is your expectations out of this \r\n" + "program?";
	String firstInterviewComittment = ": How committed will you be, especially in \r\n"
			+ "this fast-changing situation we live in and how \r\n"
			+ "will cope with changes (online training …. Etc.) ";
	String technicalInterviewEasyConcept = "Easy concept question (Verbal)";
	String technicalInterviewMeduimConcept = "Medium concept question (Algorithm)";
	String technicalInterviewNewConcept = "New concept Questions";
	String companyBackground = "About AXSOS";
	String selfAssessmentQuestion = "Self-assessment";
	String successQuestion = "What does success mean to you?";
	String motivationsQuestion = "How do you motivate yourself?";

	@BeforeEach()
	public void setUp() {

	}

	/**
	 * method to test one to one interview generating
	 */
	@Test
	public void testGenerateOneToOne() {
		interview = MainFactoryInterview.generateOneToOne();
		assertEquals(InterviewType.ONE_ON_ONE, interview.getType());

		assertEquals(OneToOneDiscussionQuestion, interview.getQuestions().get(0).getQuestionText());

	}

	/**
	 * method to test first interview generating
	 */
	@Test
	public void testGenerateFirst() {
		interview = MainFactoryInterview.generateFirst();
		assertEquals(InterviewType.FIRST, interview.getType());
		assertEquals(personalQuestion, interview.getQuestions().get(0).getQuestionText());
		assertEquals(goalsQuestion, interview.getQuestions().get(1).getQuestionText());
		assertEquals(firstInterviewMotives, interview.getQuestions().get(2).getQuestionText());
		assertEquals(firstInterviewExpectations, interview.getQuestions().get(3).getQuestionText());
		assertEquals(firstInterviewComittment, interview.getQuestions().get(4).getQuestionText());

	}

	/**
	 * method to test technial interview generating
	 */
	@Test
	public void testGenerateTechnical() {
		interview = MainFactoryInterview.generateTechnical();
		assertEquals(InterviewType.TECHNICAL, interview.getType());
		assertEquals(technicalInterviewEasyConcept, interview.getQuestions().get(0).getQuestionText());
		assertEquals(technicalInterviewMeduimConcept, interview.getQuestions().get(1).getQuestionText());
		assertEquals(technicalInterviewNewConcept, interview.getQuestions().get(2).getQuestionText());

	}

	/**
	 * method to test personal interview generating
	 */
	@Test
	public void testGeneratePersonal() {
		interview = MainFactoryInterview.generatePersonal();
		assertEquals(InterviewType.PERSONAL, interview.getType());

		assertEquals(personalQuestion, interview.getQuestions().get(0).getQuestionText());
		assertEquals(companyBackground, interview.getQuestions().get(1).getQuestionText());
		assertEquals(selfAssessmentQuestion, interview.getQuestions().get(2).getQuestionText());
		assertEquals(successQuestion, interview.getQuestions().get(3).getQuestionText());
		assertEquals(motivationsQuestion, interview.getQuestions().get(4).getQuestionText());

	}

}
