package com.trivia.controller;


import com.trivia.model.Answer;
import com.trivia.model.Question;
import com.trivia.repository.AnswerRepository;
import com.trivia.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.not;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
class TriviaControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    QuestionService questionService;



    @Test
    void getCount() throws Exception {
        mockMvc.perform(get("/count"))
                .andExpect(status().isOk())
                .andExpect(content().string("1553"));
    }

    @Test
    void getAQuestion() throws Exception {
        Answer testAnswer = answerRepository.findTopByOrderByIdDesc();
        List<Answer> testAnswerList = answerRepository.findByQuestion(testAnswer.getQuestion());

        mockMvc.perform(get("/{questionId}", testAnswer.getQuestion().getId()))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.question").exists())
                .andExpect(jsonPath("$.answers", hasSize(testAnswerList.size())))
                .andExpect(jsonPath("$.answers[*].text").exists());
    }

    @Test
    void getRandomQuizOf10Questions() throws Exception {
        List<Question> randomQuiz = questionService.getRandomQuiz();

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(10)))
                .andExpect(jsonPath("$[0].id", not(randomQuiz.get(0).getId() - 10)));
    }
}