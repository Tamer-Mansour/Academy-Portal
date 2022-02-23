package com.example.academyApp.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.academyApp.models.Cohort;

@Repository
public interface CohortRepository extends CrudRepository<Cohort, Long> {
	List<Cohort> findAll();

	Cohort findByCohortName(String cohortName);

	List<Cohort> findByStartDateBetween(Date start, Date end);

}
