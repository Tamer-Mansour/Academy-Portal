package com.example.academyApp.viewController;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.academyApp.controllers.StudentController;
import com.example.academyApp.models.Student;

@Controller
public class EditSudentDetails {
	private StudentController studentController;

	public EditSudentDetails(StudentController studentController) {
		super();
		this.studentController = studentController;
	}

	/*
	 * get method for editing student page , returns jsp file and send the cohort in
	 * a model to the view
	 */
	@RequestMapping("/student/{personalId}/edit")
	public String edit(@PathVariable("personalId") Long personalId, Model model) {
		Student student = studentController.edit(personalId);
		model.addAttribute("student", student);
		return "/Student/editStudentDetails.jsp";
	}

	/*
	 * put method to edit the student after checking for errors and update it by
	 * save method the return jsp file
	 */
	@RequestMapping(value = "/student/{personalId}", method = RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "/Student/editStudentDetails.jsp";
		} else {
			studentController.update(student);
			return "redirect:/";
		}
	}

}
