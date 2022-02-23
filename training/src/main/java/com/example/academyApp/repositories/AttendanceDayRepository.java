package com.example.academyApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.academyApp.models.AttendanceDay;

@Repository
public interface AttendanceDayRepository extends CrudRepository<AttendanceDay, Long> {

	
}
