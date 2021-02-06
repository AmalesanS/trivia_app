package com.trivia.repository;

import com.trivia.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

public interface QuestionRepository extends PagingAndSortingRepository<Question, Integer> {
}
