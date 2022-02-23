package com.example.academyApp.viewController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.academyApp.controllers.InterviewController;
import com.example.academyApp.models.Interview;

@Controller
public class InterviewFullDetailsViewController {
	final InterviewController interviewController;

	public InterviewFullDetailsViewController(InterviewController interviewController) {
		super();
		this.interviewController = interviewController;
	}

	/*
	 * display all specific interview full details
	 */	@GetMapping("/interview/{id}")
	public String showInterviewDetails(@PathVariable("id") Long id, Model model) {
		Interview interview = interviewController.showInterviewDetails(id);
		model.addAttribute("interview", interview);
		return "/Interview/interviewFullDetails.jsp";
	}

}
