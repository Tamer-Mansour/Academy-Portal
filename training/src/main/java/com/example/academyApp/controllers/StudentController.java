package com.example.academyApp.controllers;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.academyApp.factory.MainFactoryInterview;
import com.example.academyApp.models.Interview;
import com.example.academyApp.models.Student;
import com.example.academyApp.models.enums.InterviewType;
import com.example.academyApp.services.InterviewService;
import com.example.academyApp.services.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	private StudentService studentService;
	private InterviewService interviewService;

	public StudentController(StudentService studentService, InterviewService interviewService) {
		this.studentService = studentService;

		this.interviewService = interviewService;
	}

	@RequestMapping("/student/add")
	@ResponseBody
	public Student addStudent(Student student) {
		return student;
	}

	@PostMapping(value = "/api/student/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Student createStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	/*
	 * Get method to return details info as json for selected student based on Id
	 */
	@GetMapping("/student/{id}")
	@ResponseBody
	public Student studentDetails(@PathVariable("id") Long id) {
		Student student = studentService.findById(id);
		return student;

	}

	@RequestMapping("/student/{id}/edit")
	@ResponseBody
	public Student edit(@PathVariable("id") Long id) {
		return studentService.findById(id);

	}

	@PutMapping("/student/{id}/edit")
	public Student update(@RequestBody @ModelAttribute("student") Student student) {
		// TODO:handle errors
		return studentService.update(student);
	}

	@GetMapping("/interview")
	@ResponseBody
	public Interview getInterview(@RequestParam(value = "type") int type, @RequestParam(value = "id") Long id) {
		Interview interview = MainFactoryInterview.creatInterviewByType(InterviewType.get(type));
		Student student = studentService.findById(id);
		interview.setStudent(student);
		return interview;

	}

	/*
	 * api to show some interview details for specific student.passed student id
	 * returned list of all student interviews
	 */
	@GetMapping("/student/interview/{studentId}")
	@ResponseBody
	public List<Interview> showInterview(@PathVariable("studentId") Long studentId) {
		Student student = studentService.findById(studentId);
		List<Interview> interviews = interviewService.findByStudent(student);
		return interviews;
	}

}
