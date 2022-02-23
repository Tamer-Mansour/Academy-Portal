package com.example.academyApp.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.academyApp.models.Attendance;
import com.example.academyApp.models.AttendanceDay;
import com.example.academyApp.models.Cohort;
import com.example.academyApp.services.AttendanceDayService;
import com.example.academyApp.services.CohortService;

@RestController
@RequestMapping("/api")
public class AttendanceDayController {
	final CohortService cohortService;
	final AttendanceDayService attendanceDayService;

	public AttendanceDayController(CohortService cohortService, AttendanceDayService attendanceDayService) {
		super();
		this.cohortService = cohortService;
		this.attendanceDayService = attendanceDayService;
	}

	@PostMapping("/empty-attendance-day/{cohortId}")
	public AttendanceDay createEmptyAttendanceDay(@PathVariable("cohortId") Long cohortId) {
		AttendanceDay attendanceDay = new AttendanceDay();
		attendanceDay.setDate(new Date());
		Cohort cohort = cohortService.findById(cohortId);
		attendanceDay.setCohort(cohort);
		List<Attendance> attendanceList = new ArrayList<Attendance>();
		cohort.getStudents().forEach(student -> {
			Attendance attendance = new Attendance();
			attendance.setStudent(student);
			attendance.setPresent(false);
			attendance.setAttendanceDay(attendanceDay);
			attendanceList.add(attendance);
		});
		attendanceDay.setAttendances(attendanceList);
		return attendanceDayService.save(attendanceDay);

	}

	@PostMapping("/attendance-day")
	public AttendanceDay createAttendanceDay(@RequestBody AttendanceDay attendanceDay) {
		return attendanceDayService.save(attendanceDay);
	}

}
