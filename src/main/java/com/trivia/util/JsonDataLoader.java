//package com.trivia.util;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import com.trivia.model.Answer;
//import com.trivia.model.Question;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.core.io.Resource;
//import org.springframework.stereotype.Component;
//import com.trivia.repository.AnswerRepository;
//import com.trivia.repository.QuestionRepository;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@Component
//public class JsonDataLoader implements ApplicationRunner {
//
//  @Value("classpath:trivia.json")
//  Resource dataFile;
//
//  ObjectMapper objectMapper;
//
//  private QuestionRepository questionRepository;
//
//  private AnswerRepository answerRepository;
//
//  public JsonDataLoader(QuestionRepository questionRepository, AnswerRepository answerRepository, ObjectMapper objectMapper) {
//    this.questionRepository = questionRepository;
//    this.answerRepository = answerRepository;
//    this.objectMapper = objectMapper;
//  }
//
//  public void run(ApplicationArguments args) throws IOException {
//    Question[] questions = objectMapper.readValue(Files.readAllBytes(dataFile.getFile().toPath()), Question[].class);
//
//    Arrays.stream(questions).forEach(question -> {
//      Question savedQuestion = questionRepository.save(question);
//
//      List<Answer> savedAnswers = new ArrayList<>();
//
//      question.getAnswers().stream().forEach(answer -> {
//        answer.setQuestion(savedQuestion);
//        savedAnswers.add(answerRepository.save(answer));
//      });
//
//      question.setAnswers(savedAnswers);
//      questionRepository.save(savedQuestion);
//    });
//  }
//}
