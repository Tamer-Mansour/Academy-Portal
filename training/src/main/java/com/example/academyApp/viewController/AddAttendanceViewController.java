package com.example.academyApp.viewController;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.academyApp.controllers.AttendanceDayController;
import com.example.academyApp.controllers.CohortController;
import com.example.academyApp.models.AttendanceDay;

@Controller
public class AddAttendanceViewController {

	final CohortController cohortController;
	final AttendanceDayController attendanceDayController;

	public AddAttendanceViewController(CohortController cohortController,
			AttendanceDayController attendanceDayController) {
		super();
		this.cohortController = cohortController;
		this.attendanceDayController = attendanceDayController;
	}

	@GetMapping("/empty-attendance-day/{cohortId}")
	public String addNewAttendace(@PathVariable("cohortId") Long id, Model model) {
		AttendanceDay attendanceDay = attendanceDayController.createEmptyAttendanceDay(id);
		model.addAttribute("attendanceDay", attendanceDay);
		return "/Attendance/addAttendancePage.jsp";

	}

	@PostMapping("/attendance/add")
	public String addAttendance(@Valid @ModelAttribute("attendanceDay") AttendanceDay attendanceDay,
			BindingResult result) {

		if (result.hasErrors()) {
			return "/Attendace/addAttendancePage.jsp";
		} else {
			attendanceDayController.createAttendanceDay(attendanceDay);
			return "redirect:/";

		}

	}

}
