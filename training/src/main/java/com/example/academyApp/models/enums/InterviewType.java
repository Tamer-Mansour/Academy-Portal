package com.example.academyApp.models.enums;

public enum InterviewType {
	TECHNICAL, PERSONAL, ONE_ON_ONE, FIRST;

	public static InterviewType get(int ordinal) {
		return InterviewType.values()[ordinal];
	}

}
