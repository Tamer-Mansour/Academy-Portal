package com.example.academyApp.viewController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.academyApp.controllers.StudentController;
import com.example.academyApp.models.Student;

@Controller
public class StudentDetailsViewController {
	private StudentController studentController;

	public StudentDetailsViewController(StudentController studentController) {
		this.studentController = studentController;
	}

	/*
	 * Get method to display details info for selected student based on Id and
	 * return details page
	 */
	@GetMapping("/student/{personalId}")
	public String studentDetails(@PathVariable("personalId") Long personalId, Model model) {
		Student student = studentController.studentDetails(personalId);
		model.addAttribute("student", student);
		return "/Student/studentDetails.jsp";
	}
}
