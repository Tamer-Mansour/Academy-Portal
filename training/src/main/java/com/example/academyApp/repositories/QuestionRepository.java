package com.example.academyApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.academyApp.models.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {

}
