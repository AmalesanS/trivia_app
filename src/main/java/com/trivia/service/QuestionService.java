package com.trivia.service;

import com.trivia.model.Question;
import com.trivia.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuestionService {
    QuestionRepository questionRepository;
    Random random = new Random();

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question getQuestionById(int id) {
        return questionRepository.findById(id).orElse(null);
    }

    public List<Question> getRandomQuiz() {
        Pageable firstPageRequest = PageRequest.of(0, 10);
        Page<Question> firstPage = questionRepository.findAll(firstPageRequest);
        Pageable randomPageRequest = PageRequest.of(random.nextInt(firstPage.getTotalPages()), 10);
        Page<Question> randomPage = questionRepository.findAll(randomPageRequest);
        return randomPage.getContent();
    }

    public Long getQuestionCount() {
        return questionRepository.count();
    }
}
