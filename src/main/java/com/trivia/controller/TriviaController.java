package com.trivia.controller;

import com.trivia.model.Question;
import com.trivia.repository.QuestionRepository;
import com.trivia.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TriviaController {
    QuestionRepository repository;

    QuestionService service;

    public TriviaController(QuestionRepository repository, QuestionService service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping("/{id}")
    public Question getAQuestion(@PathVariable int id) {
        return service.getQuestionById(id);
    }

    @GetMapping("/count")
    public long getQuestionCount() {
        return service.getQuestionCount();
    }

    @GetMapping
    public List<Question> getRandomQuestion() {
        return service.getRandomQuiz();
    }
}
