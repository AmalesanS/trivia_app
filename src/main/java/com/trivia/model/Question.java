package com.trivia.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "QUESTION")
public class Question {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    String question;
    String timestamp;
    @OneToMany
    List<Answer> answers;

    public Question(Integer id, String question, String timestamp) {
        this.id = id;
        this.question = question;
        this.timestamp = timestamp;
    }
}
