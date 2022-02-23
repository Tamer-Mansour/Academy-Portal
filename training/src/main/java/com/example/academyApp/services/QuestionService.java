package com.example.academyApp.services;

import org.springframework.stereotype.Service;

import com.example.academyApp.models.Question;
import com.example.academyApp.repositories.QuestionRepository;

@Service
public class QuestionService {
	private final QuestionRepository questionRepo;

	public QuestionService(QuestionRepository questionRepo) {
		super();
		this.questionRepo = questionRepo;
	}

	public Question saveQuestion(Question question) {
		question = questionRepo.save(question);
		return question;
	}
}
