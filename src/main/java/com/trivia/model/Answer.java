package com.trivia.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
public class Answer {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JsonIgnore
    private Question question;

    private char choice;

    private String text;

    private boolean correct;

    public Answer(Question question, char choice, String text, boolean isCorrect) {
        this.question = question;
        this.choice = choice;
        this.text = text;
        this.correct = isCorrect;
    }
}
