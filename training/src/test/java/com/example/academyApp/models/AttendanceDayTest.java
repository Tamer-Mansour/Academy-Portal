package com.example.academyApp.models;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AttendanceDayTest {
	private AttendanceDay bucket;
	private Date date = new Date(9 / 9 / 2021);
	private String info = "none";
	private String name = "090901";

	@BeforeEach
	void setUp() {
		bucket = new AttendanceDay();
	}

	@Test
	public void testBucketDate() {
		bucket.setDate(date);
		assertNotNull(bucket.getDate());
	}

	@Test
	public void testBucketInfo() {
		bucket.setInfo(info);
		assertNotNull(bucket.getInfo());
	}

	@Test
	public void testBucketName() {
		bucket.setName(name);
		assertNotNull(bucket.getName());
	}

}
