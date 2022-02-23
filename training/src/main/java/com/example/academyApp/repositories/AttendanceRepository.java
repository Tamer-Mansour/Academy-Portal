package com.example.academyApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.academyApp.models.Attendance;

@Repository
public interface AttendanceRepository extends CrudRepository<Attendance, Long> {
}
