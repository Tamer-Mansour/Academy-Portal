package com.example.academyApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.academyApp.models.Applicant;
import com.example.academyApp.models.Student;
import com.example.academyApp.models.enums.ApplicantStatus;
import com.example.academyApp.repositories.ApplicantRepository;

@Service
public class ApplicantService {
	private final ApplicantRepository applicantRepository;
	private final StudentService studentService; 

	public ApplicantService(ApplicantRepository applicantRepository, StudentService studentService) {
		this.applicantRepository = applicantRepository;
		this.studentService = studentService;
	}

	/**
	 * method to find applicant by name
	 * 
	 * @param name
	 * @return applicant associated with this name
	 */
	public Applicant findByName(String name) {
		return applicantRepository.findByName(name);
	}

	/**
	 * method to find applicant by id
	 * 
	 * @param id
	 * @return applicant associated with this id
	 */
	public Applicant findById(Long id) {
		Optional<Applicant> optional = applicantRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

	/**
	 * method to find all applicants
	 * 
	 * @return all applicants
	 */
	public List<Applicant> findAll() {
		return applicantRepository.findAll();
	}

	/**
	 * method to save applicant
	 */
	public Applicant save(Applicant applicant) {
		return applicantRepository.save(applicant);
	}

	/**
	 * method to turn the student this applicant turned into
	 * 
	 * @param applicant
	 * @return
	 */

	public Student turnApplicantToStudent(Long applicantId) {
		Applicant applicant = findById(applicantId);
		Student student;
		if (applicant.getStatus().equals(ApplicantStatus.ACCEPTED)) {
			student = new Student(applicant.getName(), applicant.getEmail(), applicant.getPersonalId(),
					applicant.getGender(), applicant.getCity(), applicant.getPhoneNumber(),
					applicant.getEducationalBackground(), applicant.getDateOfBirth(), applicant.getCohort());
			studentService.saveStudent(student);
			return student;
		}
		return null;
	}

}
