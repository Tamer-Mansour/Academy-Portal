package com.example.academyApp.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String questionText;
	private String answer;
	private String notes;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "interview_id")
	private Interview interview;

	public Question() {

	}
	

	public Question(Long id, String questionText, String answer, String notes, Interview interview) {
		super();
		this.id = id;
		this.questionText = questionText;
		this.answer = answer;
		this.notes = notes;
		this.interview = interview;
	}


	/* constructor to add static question attribute */
	public Question(String questionText, String answer, String notes) {
		super();
		this.questionText = questionText;
		this.answer = answer;
		this.notes = notes;
	}

	public Long getId() {
		return id;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Interview getInterview() {
		return interview;
	}

	public void setInterview(Interview interview) {
		this.interview = interview;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
