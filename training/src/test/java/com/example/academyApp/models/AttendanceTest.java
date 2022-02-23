package com.example.academyApp.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AttendanceTest {
	Attendance attendance;
	Student student;
	boolean status = false;
	AttendanceDay attendanceDay;

	@BeforeEach
	void setUp() {
		attendance = new Attendance();

	}

	/**
	 * test of new attendance
	 */
	@Test
	void testApplicantObject() {
		assertNotNull(attendance);
	}

	/**
	 * method to test adding student to attendance
	 */
	@Test
	void testAttendanceStudent() {
		student = new Student();
		attendance.setStudent(student);
		assertNotNull(attendance.getStudent());
	}

	/**
	 * method to test adding bucket to attendance
	 */
	@Test
	void testAttendanceBucket() {
		attendanceDay = new AttendanceDay();
		attendance.setAttendanceDay(attendanceDay);
		assertNotNull(attendance.getAttendanceDay());
	}

	/**
	 * method to test status
	 */
	@Test
	void testAttendanceStatus() {
		attendance.setPresent(status);
		assertEquals(status, attendance.isPresent());
	}
}
