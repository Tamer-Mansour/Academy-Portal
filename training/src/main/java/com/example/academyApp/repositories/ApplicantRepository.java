package com.example.academyApp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.academyApp.models.Applicant;

@Repository
public interface ApplicantRepository extends CrudRepository<Applicant, Long> {
	List<Applicant> findAll();

	Applicant findByName(String name);
}
