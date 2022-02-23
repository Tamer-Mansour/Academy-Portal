package com.example.academyApp.viewController;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.academyApp.controllers.CohortController;
import com.example.academyApp.models.Cohort;

@Controller
public class CohortsViewController {
	private final CohortController cohortController;

	public CohortsViewController(CohortController cohortController) {
		super();
		this.cohortController = cohortController;
	}

	/**
	 * method to view the list of the cohorts in jsp page.
	 * 
	 * @param model
	 * @return
	 */

	@GetMapping("/cohorts")
	public String viewCohorts(Model model) {
		List<Cohort> cohortList = cohortController.listAllCohorts();
		model.addAttribute("cohortList", cohortList);
		return "/Cohort/cohortPage.jsp";
	}
}