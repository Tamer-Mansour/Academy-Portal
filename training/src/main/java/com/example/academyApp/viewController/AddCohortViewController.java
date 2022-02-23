package com.example.academyApp.viewController;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.academyApp.controllers.CohortController;
import com.example.academyApp.models.Cohort;
import com.example.academyApp.services.UserService;

@Controller
@RequestMapping("/cohort/add")
public class AddCohortViewController {

	private final CohortController cohortController;

	public AddCohortViewController(CohortController cohortController) {
		super();
		this.cohortController = cohortController;

	}

	/**
	 * method to add a cohort
	 * 
	 * @param cohort
	 * @param principal
	 * @param model
	 * @param result
	 * @return the adding template view in jsp file
	 */
	@PostMapping("")
	public String addCohort(@Valid @ModelAttribute("cohort") Cohort cohort, BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/";
		} else {
			this.cohortController.createNewCohort(cohort);

			return "/home/homePage.jsp";
		}
	}

	/**
	 * method to get the cohort added.
	 * 
	 * @param cohort
	 * @return the view in jsp file
	 */
	@RequestMapping("")
	public String addCohort(@ModelAttribute("cohort") Cohort cohort) {

		return "/Cohort/addCohort.jsp";
	}
}
