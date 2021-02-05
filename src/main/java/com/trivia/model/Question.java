package com.trivia.model;

public class Question {
    int questionNumber;
    String questionText;
    String createdAt;

    public Question(int questionNumber, String questionText, String createdAt) {
        this.questionNumber = questionNumber;
        this.questionText = questionText;
        this.createdAt = createdAt;
    }
}
