package com.example.academyApp.viewController;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.academyApp.controllers.CohortController;
import com.example.academyApp.models.Cohort;

@Controller
public class EditCohortViewController {
	private CohortController cohortController;

	public EditCohortViewController(CohortController cohortController) {
		super();
		this.cohortController = cohortController;
	}

	/*
	 * get method for editing cohort page , returns jsp file and send the cohort in
	 * a model to the view
	 */
	@RequestMapping("/cohort/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Cohort cohort = cohortController.edit(id);
		model.addAttribute("cohort", cohort);
		return "/Cohort/editCohortPage.jsp";
	}

	/*
	 * put method to edit the cohort after checking for errors and update it by save
	 * method the return jsp file
	 */
	@RequestMapping(value = "/cohort/{id}", method = RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("cohort") Cohort cohort, BindingResult result) {
		if (result.hasErrors()) {
			return "/Cohort/editCohortPage.jsp";
		} else {
			cohortController.update(cohort);
			return "redirect:/";
		}
	}

}
