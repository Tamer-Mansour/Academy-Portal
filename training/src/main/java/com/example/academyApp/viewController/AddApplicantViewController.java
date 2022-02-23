package com.example.academyApp.viewController;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.academyApp.controllers.ApplicantController;
import com.example.academyApp.models.Applicant;
import com.example.academyApp.services.CohortService;

@Controller
@RequestMapping("/applicant/add")
public class AddApplicantViewController {
	private final ApplicantController applicantController;
	private final CohortService cohortService;

	public AddApplicantViewController(ApplicantController applicantController, CohortService cohortService) {
		super();
		this.applicantController = applicantController;
		this.cohortService = cohortService;
	}

	/**
	 * method to get applicant to add
	 * 
	 * @param applicant
	 * @return
	 */
	@RequestMapping("")
	public String addApplicant(@ModelAttribute("applicant") Applicant applicant, Model model) {
		applicantController.createNewApplicant(applicant);
		model.addAttribute("cohorts", cohortService.findAll());
		return "/Applicant/addApplicant.jsp";

	}

	/**
	 * method to add applicant
	 * 
	 * @param applicant
	 * @param result
	 * @return
	 */
	@PostMapping("")
	public String createApplicant(@Valid @ModelAttribute("applicant") Applicant applicant, BindingResult result) {
		if (result.hasErrors()) {
			return "/Applicant/addApplicant.jsp";
		} else {
			applicantController.createNewApplicant(applicant);
			return "redirect:/applicant/add";
		}
	}

}
