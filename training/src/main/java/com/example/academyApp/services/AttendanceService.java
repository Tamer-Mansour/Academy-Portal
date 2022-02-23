package com.example.academyApp.services;

import org.springframework.stereotype.Service;

import com.example.academyApp.models.Attendance;
import com.example.academyApp.repositories.AttendanceRepository;

@Service
public class AttendanceService {
	final AttendanceRepository attendanceRepo;

	public AttendanceService(AttendanceRepository attendanceRepo) {
		super();
		this.attendanceRepo = attendanceRepo;
	}

	public Attendance saveAttendance(Attendance attendance) {
		return attendanceRepo.save(attendance);
	}

}
