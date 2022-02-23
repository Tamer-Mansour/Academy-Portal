package com.example.academyApp.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.academyApp.models.Interview.Grade;
import com.example.academyApp.models.enums.InterviewType;

import aj.org.objectweb.asm.Type;

public class InterviewTest {
	Interview interview;

	@BeforeEach
	public void setUp() throws Exception {
		interview = new Interview();
	}

	public void testFindAll() {
		assertNotNull(interview);
	}

	/**
	 * method to test the type of the interview
	 */
	@Test
	public void testType() {

		interview.setType(InterviewType.ONE_ON_ONE);
		assertEquals(InterviewType.ONE_ON_ONE, interview.getType());
	}

	/**
	 * method to test the grade of the interview
	 */
	@Test
	public void testGrade() {
		interview.setGrade(Grade.EXCELLENT);
		assertEquals(Grade.EXCELLENT, interview.getGrade());
	}

	/**
	 * method to test the name of the interview
	 */
	@Test
	public void testName() {
		interview.setName("Tamer");
		assertEquals("Tamer", interview.getName());
	}

	/**
	 * method to test the interviewer of the interview
	 */
	@Test
	public void testInterviewer() {
		interview.setInterviewer("Waleed");
		assertEquals("Waleed", interview.getInterviewer());
	}

	/**
	 * method to test the location of the interview
	 */
	@Test
	public void testLocation() {
		interview.setLocation("ramallah");
		assertEquals("ramallah", interview.getLocation());
	}

	/**
	 * method to test the date of the interview
	 */
	@Test
	void testDate() {
		Date date = new Date(11 / 9 / 1996);
		interview.setDate(date);
		assertEquals(date, interview.getDate());

	}

}
