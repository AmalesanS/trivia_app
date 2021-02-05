package com.trivia.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class QuestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long quiz_id;
    private Long question_number;
    private String question;
    private Date created_at;
    @OneToMany
    @JoinColumn(name = "QUESTION_ID", referencedColumnName = "ID")
    private List<AnswerEntity> answers;
}
