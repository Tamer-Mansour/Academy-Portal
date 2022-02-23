package com.example.academyApp.controllers;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.academyApp.services.UserService;

@Controller
public class NavigationController {
	private final UserService userService;

	public NavigationController(UserService userService) {
		super();
		this.userService = userService;
	}

	/**
	 * method to send current user to navigation bar in header
	 * 
	 * @param principal
	 * @param model
	 * @return
	 */
	public String addUserNameToHeader(Principal principal, Model model) {
		String email = principal.getName();
		model.addAttribute("currentUser", userService.findByEmail(email));
		return "Navigation/header.jsp";
	}

}

