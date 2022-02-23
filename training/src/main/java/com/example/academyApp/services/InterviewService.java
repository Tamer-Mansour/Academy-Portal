package com.example.academyApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.academyApp.models.Interview;
import com.example.academyApp.models.Student;
import com.example.academyApp.repositories.InterviewRepository;

@Service
public class InterviewService {
	private final InterviewRepository interviewRepository;
	private final QuestionService questionService;

	public InterviewService(InterviewRepository interviewRepository, QuestionService questionService) {
		this.interviewRepository = interviewRepository;
		this.questionService = questionService;
	}

	/*
	 * loop to add each question as object in db , set interview for question , save
	 * interview and question
	 */
	public Interview createInterview(Interview interview) {
		interviewRepository.save(interview);
		/* Using Lambda expressions */
		if (interview.getQuestions() != null) {
			interview.getQuestions().forEach(q -> {
				q.setInterview(interview);
				questionService.saveQuestion(q);

			});
		}

		return interview;
	}

	public List<Interview> findAll() {
		return interviewRepository.findAll();
	}

	public Interview findByName(String name) {
		List<Interview> interviews = interviewRepository.findAll();
		for (Interview interview : interviews) {
			if (interview.getName().equals(name)) {
				return interview;
			}
		}
		return null;

	}

	public Interview findById(Long id) {
		Optional<Interview> optional = interviewRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

	/* implementation to get list of interviews for student */ 
	public List<Interview> findByStudent(Student student) {
		return interviewRepository.findByStudent(student);
	}
}
