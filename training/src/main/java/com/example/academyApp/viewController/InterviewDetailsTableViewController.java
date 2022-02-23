package com.example.academyApp.viewController;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.academyApp.controllers.StudentController;
import com.example.academyApp.models.Interview;

@Controller
public class InterviewDetailsTableViewController {
	final StudentController studentController;

	public InterviewDetailsTableViewController(StudentController studentController) {
		super();
		this.studentController = studentController;
	}

	/*
	 * display table of all students interviews in table of interview info
	 */ @GetMapping("/student/interview/{studentId}")
	public String displayInterview(@PathVariable("studentId") Long studentId, Model model) {
		List<Interview> interviews = studentController.showInterview(studentId);
		model.addAttribute("interviews", interviews);
		return "/Interview/interviewDetailsPage.jsp";
	}
}
