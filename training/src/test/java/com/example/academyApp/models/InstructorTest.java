package com.example.academyApp.models;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.academyApp.models.Instructor;


public class InstructorTest {
	private static Validator validator;
	Instructor instructor = new Instructor();

	@BeforeAll
	static void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Test
	void testInstructor() {
		instructor.setAcademicId(1);
		instructor.setCity("Nablus");
		Set<ConstraintViolation<Instructor>> violations = validator.validate(instructor);
		for (ConstraintViolation<Instructor> violation : violations) {
			System.out.println(violation.getMessage());
		}
		assertTrue(violations.isEmpty());
	}

	@Test
	void testNotNull() {
		assertNotNull(instructor);
	}
}
