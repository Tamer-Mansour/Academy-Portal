package com.example.academyApp.services;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.academyApp.models.Student;
import com.example.academyApp.repositories.StudentRepository;

@Service
public class StudentService {
	private StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	/*
	 * method to find student by name
	 */
	public Student findByName(String name) {
		return studentRepository.findByName(name);
	}

	/*
	 * method to find all student
	 */
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	/*
	 * method to save all student and create student number from the cohort
	 */
	public Student saveStudent(Student student) {
		NumberFormat formatter = new DecimalFormat("000");
		String numberOfStudents = formatter.format(student.getCohort().getStudents().size() + 1);

		student.setStudentNumber(student.getCohort().getCohortName() + (numberOfStudents));
		return studentRepository.save(student);
	}

	/**
	 * method to find a student by its id
	 * 
	 * @param id
	 * @return the student with this id
	 */
	public Student findById(Long id) {
		Optional<Student> optional = studentRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

	public Student update(Student student) {
		return studentRepository.save(student);
	}

}
