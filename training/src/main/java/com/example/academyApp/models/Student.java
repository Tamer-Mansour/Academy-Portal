package com.example.academyApp.models;

import java.util.Date;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.example.academyApp.models.enums.Gender;
import com.example.academyApp.models.enums.StudentStatus;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "students")
public class Student extends User {

	private String phoneNumber;
	private String educationalBackground;
	private String emergencyContact;
	private String allergyAndDiet;
	private String notes;
	private StudentStatus status;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOfBirth;
	@ManyToOne(fetch = FetchType.LAZY)
	private User instructor;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cohort_id")
	@JsonIgnore
	private Cohort cohort;
	private String studentNumber;
	private String githubAccount;
	private String linkedInProfile;
	private String technicalExperience;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date firstDay;
	private String technicalsToImprove;
	private String personalToImprove;
	private String personalSkills;
	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Interview> interviews;
	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Attendance> atendances;

	public Student() {

	}

	public Student(String name, String email, long id, Gender gender, String city, String phoneNumber,
			String educationalBackground, Date dateOfBirth, Cohort cohort) {
		super.setName(name);
		super.setEmail(email);
		super.setCity(city);
		super.setPersonalId(id);
		super.setGender(gender);
		this.phoneNumber = phoneNumber;
		this.educationalBackground = educationalBackground;
		this.dateOfBirth = dateOfBirth;
		this.cohort = cohort;
	}

	public User getInstructor() {
		return instructor;
	}

	public void setInstructor(User instructor) {
		this.instructor = instructor;
	}

	public String getGithubAccount() {
		return githubAccount;
	}
	

	public List<Interview> getInterviews() {
		return interviews;
	}

	public void setInterviews(List<Interview> interviews) {
		this.interviews = interviews;
	}

	public void setGithubAccount(String githubAccount) {
		this.githubAccount = githubAccount;
	}

	public String getLinkedInProfile() {
		return linkedInProfile;
	}

	public void setLinkedInProfile(String linkedInProfile) {
		this.linkedInProfile = linkedInProfile;
	}

	public List<Attendance> getAtendances() {
		return atendances;
	}

	public void setAtendances(List<Attendance> atendances) {
		this.atendances = atendances;
	}

	public String getTechnicalExperience() {
		return technicalExperience;
	}

	public void setTechnicalExperience(String technicalExperience) {
		this.technicalExperience = technicalExperience;
	}

	public Date getFirstDay() {
		return firstDay;
	}

	public void setFirstDay(Date firstDay) {
		this.firstDay = firstDay;
	}

	public String getTechnicalsToImprove() {
		return technicalsToImprove;
	}

	public void setTechnicalsToImprove(String technicalsToImprove) {
		this.technicalsToImprove = technicalsToImprove;
	}

	public String getPersonalToImprove() {
		return personalToImprove;
	}

	public void setPersonalToImprove(String personalToImprove) {
		this.personalToImprove = personalToImprove;
	}

	public String getPersonalSkills() {
		return personalSkills;
	}

	public void setPersonalSkills(String personalSkills) {
		this.personalSkills = personalSkills;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEducationalBackground() {
		return educationalBackground;
	}

	public void setEducationalBackground(String educationalBackground) {
		this.educationalBackground = educationalBackground;
	}

	public String getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public String getAllergyAndDiet() {
		return allergyAndDiet;
	}

	public void setAllergyAndDiet(String allergyAndDiet) {
		this.allergyAndDiet = allergyAndDiet;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public StudentStatus getStatus() {
		return status;
	}

	public void setStatus(StudentStatus status) {
		this.status = status;
	}

	public Cohort getCohort() {
		return cohort;
	}

	public void setCohort(Cohort cohort) {
		this.cohort = cohort;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

}
