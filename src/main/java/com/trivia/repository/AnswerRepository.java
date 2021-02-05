package com.trivia.repository;

import com.trivia.entity.AnswerEntity;
import com.trivia.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<AnswerEntity, Integer> {
}
