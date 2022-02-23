package com.example.academyApp.controllers;

import org.springframework.stereotype.Controller;
import com.example.academyApp.services.InstructorService;

@Controller
public class InstructorController {
	private InstructorService instructorService;

	public InstructorController(InstructorService instructorService) {
		this.instructorService = instructorService;
	}

}
