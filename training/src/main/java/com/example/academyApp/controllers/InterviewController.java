package com.example.academyApp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.academyApp.factory.MainFactoryInterview;
import com.example.academyApp.models.Interview;
import com.example.academyApp.models.Question;
import com.example.academyApp.models.Student;
import com.example.academyApp.models.enums.InterviewType;
import com.example.academyApp.services.InterviewService;

@RestController
@RequestMapping("/api")
public class InterviewController {
	final InterviewService interviewService;

	public InterviewController(InterviewService interviewService) {
		super();
		this.interviewService = interviewService;
	}

	/* get api to add static question temporary and return interview */
	@GetMapping("/interview/add")
	@ResponseBody
	public Interview newInterview(Interview interview) {
		List<Question> questions = new ArrayList<>();
		questions.add(new Question("", "", ""));
		interview.setQuestions(questions);
		return interview;
	}

	// TODO: add student to interview
	/* post api to save question and interview */
	@RequestMapping(value = "/interview/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Interview create(@RequestBody Interview interview) {
		interview = interviewService.createInterview(interview);
		return interview;

	}

	/*
	 * api to get the interview to show all the details. passed interview id
	 */
	@GetMapping("/interview/{id}")
	@ResponseBody
	public Interview showInterviewDetails(@PathVariable("id") Long id) {
		Interview interview = interviewService.findById(id);
		return interview;
	}
}
