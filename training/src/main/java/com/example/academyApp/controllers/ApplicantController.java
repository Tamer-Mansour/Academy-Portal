package com.example.academyApp.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.academyApp.models.Applicant;
import com.example.academyApp.models.Student;
import com.example.academyApp.services.ApplicantService;

@RestController
@RequestMapping("/api")
public class ApplicantController {
	private final ApplicantService applicantService;

	public ApplicantController(ApplicantService applicantService) {
		super();
		this.applicantService = applicantService;
	}

	/**
	 * method to get applicant
	 * 
	 * @param applicant
	 * @return applicant
	 */
	@GetMapping("/applicant/add")
	@ResponseBody
	public Applicant newApplicant(Applicant applicant) {
		return applicant;
	}

	/**
	 * method to add applicant
	 * 
	 * @param applicant
	 * @return applicant
	 */
	@PostMapping(value = "/applicant/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Applicant createNewApplicant(@RequestBody Applicant applicant) {
		return applicantService.save(applicant);
	}

	/**
	 * method to get applicant details
	 * 
	 * @param id
	 * @return applicant
	 */
	@RequestMapping("/applicant/{id}")
	public Applicant applicantDetails(@PathVariable("id") Long id) {
		return applicantService.findById(id);
	}


	/**
	 * method to return the student
	 * 
	 * @param applicant
	 * @return student
	 */

	@PostMapping(value = "applicant/{applicantId}/student", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Student turnToStudent(@PathVariable("applicantId") Long applicantId) {
		return applicantService.turnApplicantToStudent(applicantId);
	}


	/**
	 * method to get all applicants
	 * 
	 * @param model
	 * @return
	 */

	@RequestMapping("/applicants")
	@ResponseBody
	public List<Applicant> listAllApplicants() {
		return applicantService.findAll();
	}




}
