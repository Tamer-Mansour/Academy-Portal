package com.example.academyApp.services;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.example.academyApp.models.AttendanceDay;
import com.example.academyApp.repositories.AttendanceDayRepository;
import com.example.academyApp.repositories.AttendanceRepository;

@Service
public class AttendanceDayService {
	final AttendanceDayRepository attendanceDayRepository;
	final AttendanceRepository attendanceRepository;

	public AttendanceDayService(AttendanceDayRepository attendanceDayRepository,
			AttendanceRepository attendanceRepository) {
		super();
		this.attendanceDayRepository = attendanceDayRepository;
		this.attendanceRepository = attendanceRepository;
	}

	public AttendanceDay save(AttendanceDay attendanceDay) {
		attendanceDayRepository.save(attendanceDay);
		attendanceRepository.saveAll(attendanceDay.getAttendances());
		return attendanceDayRepository.findById(attendanceDay.getId()).get();
	}

}
