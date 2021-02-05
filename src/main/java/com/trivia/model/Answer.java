package com.trivia.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long question_id;
    private char choice;
    private String text;
    private Boolean correct;
    @Transient
    Question question;

    public Answer(Question question, char answerLetter, String answerText, Boolean correctAnswer) {
        this.question = question;
        this.choice = answerLetter;
        this.text = answerText;
        this.correct = correctAnswer;
    }
}
