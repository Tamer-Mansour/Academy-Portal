package com.example.academyApp.viewController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import com.example.academyApp.controllers.ApplicantController;

import com.example.academyApp.services.ApplicantService;

@Controller
public class ApplicantDetailsViewController {
	private final ApplicantController applicantController;

	public ApplicantDetailsViewController(ApplicantController applicantController) {
		super();
		this.applicantController = applicantController;
	}

	/**
	 * method to view applicant details
	 * 
	 * @param id
	 * @param model
	 * @return
	 */

	@RequestMapping("/applicant/{id}")
	public String viewApplicantDetails(@PathVariable("id") Long id, Model model) {
		model.addAttribute("applicant", applicantController.applicantDetails(id));
		return "/Applicant/applicantDetails.jsp";
	}

	/**
	 * method to turn applicant to student
	 * 
	 * @param applicantId
	 * @param model
	 * @return
	 */

	@GetMapping("/applicant/{applicantId}/student")
	public String turnToStudent(@PathVariable("applicantId") Long applicantId, Model model) {
		model.addAttribute("student", applicantController.turnToStudent(applicantId));
		return "/Student/studentDetails.jsp";
	}

}
