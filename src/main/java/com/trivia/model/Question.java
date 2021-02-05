package com.trivia.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quiz_id;
    private Integer question_number;
    private String question;
    private String created_at;
    @OneToMany
    @JoinColumn(name = "QUESTION_ID", referencedColumnName = "ID")
    private List<Answer> answers;

    public Question(int questionNumber, String questionText, String createdAt) {
        this.question_number = questionNumber;
        this.question = questionText;
        this.created_at = createdAt;
    }
}
