package com.trivia.service;

import com.trivia.model.Question;
import com.trivia.repository.AnswerRepository;
import com.trivia.repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TriviaServiceTest {
//    @Mock
//    QuestionRepository questionRepository;
//
//    @InjectMocks
//    TriviaService triviaService;
//
//    @Test
//    void fetchAll() {
//        // assemble
//        Question question = new Question(1, "Question question?", "12-1-1");
//        Question question2 = new Question(2, "Question question", "12-12-12");
//        when(questionRepository.findAll()).thenReturn(Arrays.asList(question, question2));
//
//        // act
//        List<Question> questionsReturnedFromService = triviaService.getAllQuestions();
//        // assert
//        assertEquals(Arrays.asList(question, question2), questionsReturnedFromService);
//    }
}