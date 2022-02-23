package com.example.academyApp.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cohorts")
public class Cohort {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cohortName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endDate;
	private String location;
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;
	@OneToMany(mappedBy = "cohort", fetch = FetchType.LAZY)
	private List<Instructor> instructors;
	@OneToMany(mappedBy = "cohort", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Student> students;
	@OneToMany(mappedBy = "cohort", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Applicant> applicants;
	@OneToMany(mappedBy = "cohort", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<AttendanceDay> AttendanceDayList;

	public Cohort() {

	}

	public Cohort(Long id, Date startDate, Date endDate, String location, Date createdAt, Date updatedAt,
			List<Instructor> instructors, List<Student> students) {
		super();
		this.id = id;
		this.cohortName = "cohort" + id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.location = location;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.instructors = instructors;
		this.students = students;
	}

	public Cohort(Date startDate, Date endDate, String location) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.location = location;
	}

	public List<Applicant> getApplicants() {
		return applicants;
	}

	public void setApplicants(List<Applicant> applicants) {
		this.applicants = applicants;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCohortName() {
		return cohortName;
	}

	public void setCohortName(String cohortName) {
		this.cohortName = cohortName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public List<AttendanceDay> getAttendanceDayList() {
		return AttendanceDayList;
	}

	public void setAttendanceDayList(List<AttendanceDay> attendanceDayList) {
		AttendanceDayList = attendanceDayList;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<Instructor> getInstructors() {
		return instructors;
	}

	public void setInstructors(List<Instructor> instructors) {
		this.instructors = instructors;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@PrePersist
	protected void onCreate() {
		this.setCreatedAt(new Date());
	}

	@PreUpdate
	protected void onUpdate() {
		this.setUpdatedAt(new Date());
	}
}
