package com.trivia.repository;

import com.trivia.model.Answer;
import com.trivia.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    Answer findTopByOrderByIdDesc();
    List<Answer> findByQuestion(Question question);
}
