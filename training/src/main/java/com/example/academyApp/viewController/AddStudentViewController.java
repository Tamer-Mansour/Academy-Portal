package com.example.academyApp.viewController;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.academyApp.controllers.StudentController;
import com.example.academyApp.models.Student;
import com.example.academyApp.services.CohortService;

@Controller
@RequestMapping("/student/add")
public class AddStudentViewController {
	private final StudentController studentController;
	private final CohortService cohortService;

	public AddStudentViewController(StudentController studentController, CohortService cohortService) {
		super();
		this.studentController = studentController;
		this.cohortService = cohortService;
	}

	@GetMapping("")
	public String addStudent(@ModelAttribute("student") Student student, Model model) {
		model.addAttribute("cohorts", cohortService.findAll());
		return "/Student/addStudent.jsp";

	}

	/*
	 * add student method TODO:assign instructor to student
	 */
	@PostMapping("")
	public String addStudent(@Valid @ModelAttribute("student") Student student, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("cohorts", cohortService.findAll());
			return "/Student/addStudent.jsp";
		}
		studentController.addStudent(student);
		return "redirect:/student/add";
	}

}
