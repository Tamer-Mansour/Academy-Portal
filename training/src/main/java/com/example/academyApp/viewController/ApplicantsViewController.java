package com.example.academyApp.viewController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.academyApp.controllers.ApplicantController;

@Controller
public class ApplicantsViewController {
	private final ApplicantController applicantController;

	public ApplicantsViewController(ApplicantController applicantController) {
		super();
		this.applicantController = applicantController;
	}

	/**
	 * method to show all applicants by name
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/applicants")
	public String getAllApplicants(Model model) {
		model.addAttribute("applicants", applicantController.listAllApplicants());
		return "/Applicant/allApplicants.jsp";
	}

}
