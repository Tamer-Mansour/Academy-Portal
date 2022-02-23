package com.example.academyApp.viewController;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.academyApp.controllers.InterviewController;
import com.example.academyApp.controllers.StudentController;
import com.example.academyApp.factory.MainFactoryInterview;
import com.example.academyApp.models.Interview;
import com.example.academyApp.models.enums.InterviewType;

@Controller
public class AddInterviewViewController {
	final InterviewController interviewController;
	final StudentController studentController;

	public AddInterviewViewController(InterviewController interviewController, StudentController studentController) {
		super();
		this.interviewController = interviewController;
		this.studentController = studentController;
	}

	/*
	 * get method to add static question temporary and display form and return page
	 * 
	 * no longer need for this method will not delete it just on case for now
	 * 
	 * @GetMapping("/interview/add") public String
	 * newInterview(@ModelAttribute("interview") Interview interview) {
	 * interviewController.newInterview(interview); //
	 * interviewController.getFirstInterview(interview) ; return
	 * "/Interview/newInterviewPage.jsp"; }
	 */

	// TODO: add student to interview
	/* post method to save question and interview */
	@PostMapping("/interview/add")
	public String create(@Valid @ModelAttribute("interview") Interview interview, BindingResult result) {
		if (result.hasErrors()) {
			return "/Interview/newInterviewPage.jsp";
		} else {
			interviewController.create(interview);
			return "redirect:/";
		}
	}

	/*
	 * get method to get the same add interview form page but based on type in query
	 * parameter
	 */
	@GetMapping("/interview")
	public String getInterview(@RequestParam(value = "type") int type, @RequestParam(value = "id") Long id,
			Model model) {
		Interview interview = studentController.getInterview(type, id);
		model.addAttribute("interview", interview);
		return "/Interview/newInterviewPage.jsp";
	}
}
