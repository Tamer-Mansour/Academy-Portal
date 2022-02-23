package com.example.academyApp.viewController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.academyApp.controllers.CohortController;
import com.example.academyApp.models.Cohort;

@Controller
public class CohortDetailsViewController {
	private final CohortController cohortController;

	public CohortDetailsViewController(CohortController cohortController) {
		super();
		this.cohortController = cohortController;
	}

	/**
	 * method to show a view for cohort details in jsp file
	 * 
	 * @param id
	 * @param model
	 * @return
	 */

	@GetMapping("/cohort/view/{id}")
	public String cohortDetails(@PathVariable("id") Long id, Model model) {
		Cohort cohort = cohortController.cohortDetails(id);
		model.addAttribute("cohort", cohort);
		return "/Cohort/cohortDetailsPage.jsp";
	}

}
