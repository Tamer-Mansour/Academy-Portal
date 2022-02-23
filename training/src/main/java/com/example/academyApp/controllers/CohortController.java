package com.example.academyApp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.academyApp.models.Attendance;
import com.example.academyApp.models.Cohort;
import com.example.academyApp.services.CohortService;

@RestController

@RequestMapping("/api")
public class CohortController {
	private final CohortService cohortService;

	/**
	 * The constructor of the controller.
	 * 
	 * @param cohortService
	 * @param userService
	 */
	public CohortController(CohortService cohortService) {

		this.cohortService = cohortService;

	}

	/**
	 * method to get the created cohort
	 * 
	 * @param cohort
	 * @return cohort
	 */
	@RequestMapping("/cohort/add")
	@ResponseBody
	public Cohort newCohort(Cohort cohort) {
		return cohort;
	}

	/**
	 * method to create cohort
	 * 
	 * @param cohort
	 * @return cohort
	 */
	@PostMapping(value = "/cohort/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Cohort createNewCohort(@RequestBody Cohort cohort) {
		return cohortService.saveCohort(cohort);
	}

	/**
	 * method to return all cohorts
	 * 
	 * @return list of all the cohorts
	 */

	@RequestMapping("/cohorts")
	@ResponseBody
	public List<Cohort> listAllCohorts() {
		return cohortService.findAll();
	}

	/**
	 * method to view details of the cohort
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/cohort/view/{id}")
	public Cohort cohortDetails(@PathVariable("id") Long id) {
		return cohortService.findById(id);
	}

	/*
	 * get method to find the cohort by id and return it as object
	 */
	@RequestMapping("/cohort/{id}/edit")
	@ResponseBody
	public Cohort edit(@PathVariable("id") Long id) {
		Cohort cohort = cohortService.findById(id);
		return cohort;
	}

	/*
	 * put method to edit the cohort and update it by save method
	 * 
	 * @ResponseBody to get response from this method . return the object
	 */
	@PutMapping("/cohort/{id}")
	@ResponseBody
	public Cohort update(@Valid @ModelAttribute("cohort") Cohort cohort) {
		// TODO:handle errors
		return cohortService.update(cohort);

	}

	@GetMapping("/cohort/{cohortId}/attendanceDay")
	public Cohort addAttendaceForCohort(@PathVariable("cohortId") Long id) {
		Cohort cohort = cohortService.findById(id);
		return cohort;
	}

}
