package com.example.academyApp.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "instructors")
public class Instructor extends User {
	// relationships with other entities
	private long academicId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="student_id")
	private User student;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cohort_id")
	private Cohort cohort;

	public Instructor() {

	}

	public long getAcademicId() {
		return academicId;
	}

	public void setAcademicId(long academicId) {
		this.academicId = academicId;
	}

	public Cohort getCohort() {
		return cohort;
	}

	public void setCohort(Cohort cohort) {
		this.cohort = cohort;
	}

}
