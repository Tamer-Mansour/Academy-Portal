package com.example.academyApp.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QuestionTest {
	Question question;

	@BeforeEach
	public void setUp() throws Exception {
		question = new Question();
	}

	@Test
	void testQuestionObject() {
		assertNotNull(question);
	}

	@Test
	public void testQuestionText() {
		question.setQuestionText("What is you are name");
		assertEquals("What is you are name", question.getQuestionText());
	}

	@Test
	public void testanswer() {
		question.setAnswer("my name is ward");
		assertEquals("my name is ward", question.getAnswer());
	}

	@Test
	public void testNotes() {
		question.setNotes("wow ");
		assertEquals("wow ", question.getNotes());
	}
	@Test
	public void testQuestions() {
		question.setQuestionText("");
		assertEquals("",question.getQuestionText());
	}

}
