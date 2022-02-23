package com.example.academyApp.services;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.academyApp.models.Cohort;
import com.example.academyApp.repositories.CohortRepository;

@Service
public class CohortService {
	private final CohortRepository cohortRepository;

	/**
	 * @param CohortRepository Constructor that have the cohort repository as an
	 *                         attribute.
	 */
	public CohortService(CohortRepository cohortRepository) {

		this.cohortRepository = cohortRepository;
	}

	/**
	 * @param Cohort Method to create the cohort object and set the name of it
	 * @return cohort
	 */
	public Cohort saveCohort(Cohort cohort) {
		NumberFormat formatter = new DecimalFormat("00");
		List<Cohort> cohorts = findNumberOfCohortsInSameYear(cohort);
		String numberOfCohorts = formatter.format(cohorts.size() + 1);
		cohort.setCohortName("CO" + LocalDate.now().getYear() + numberOfCohorts);
		return cohortRepository.save(cohort);
	}

	/**
	 * method to find all cohorts in the repository
	 * 
	 * @return list of cohorts
	 */
	public List<Cohort> findAll() {
		return cohortRepository.findAll();
	}

	/**
	 * method to find a cohort by its name attribute
	 * 
	 * @param name
	 * @return the cohort associated with this name
	 */
	public Cohort findByName(String name) {
		List<Cohort> cohorts = cohortRepository.findAll();
		for (Cohort cohort : cohorts) {
			if (cohort.getCohortName().equals(name)) {
				return cohort;
			}
		}
		return null;

	}

	/**
	 * method to find a cohort by its id
	 * 
	 * @param id
	 * @return the cohort with this id
	 */
	public Cohort findById(Long id) {
		Optional<Cohort> optional = cohortRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

	/**
	 * method to implement the query to find all cohorts in a specific year
	 */
	public List<Cohort> findNumberOfCohortsInSameYear(Cohort cohort) {
		Date start = new Date((cohort.getStartDate().getYear()), 1, 1);
		Date end = new Date((cohort.getStartDate().getYear() + 1), 1, 1);
		return cohortRepository.findByStartDateBetween(start, end);
	}

	/* this method is to use when updating cohort */
	public Cohort update(Cohort cohort) {
		return cohortRepository.save(cohort);
	}

}
