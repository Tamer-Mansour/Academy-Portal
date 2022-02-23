package com.example.academyApp.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.academyApp.models.User;
import com.example.academyApp.services.UserService;

@Controller
public class AuthController {
	final UserService userService;

	public AuthController(UserService userService) {
		super();
		this.userService = userService;

	}

	@RequestMapping("/login")
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {
		// temp : to add the admin only once to db
		List<User> users = userService.findAllUsers();
		if (users.isEmpty()) {
			userService.setAdmin();
		}
		if (error != null) {
			model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
		}
		if (logout != null) {
			model.addAttribute("logoutMessage", "Logout Successful!");
		}
		return "Auth/loginPage.jsp";
	}

	@GetMapping(value = { "/", "/home" })
	public String home(Principal principal, Model model) {
		String email = principal.getName();
		model.addAttribute("currentUser", userService.findByEmail(email));
		return "home/homePage.jsp";
	}
}
