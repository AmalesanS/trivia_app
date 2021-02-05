package com.trivia.model;

public class Answer {
    Question question;
    char answerLetter;
    String answerText;
    Boolean correctAnswer;

    public Answer(Question question, char answerLetter, String answerText, Boolean correctAnswer) {
        this.question = question;
        this.answerLetter = answerLetter;
        this.answerText = answerText;
        this.correctAnswer = correctAnswer;
    }
}
