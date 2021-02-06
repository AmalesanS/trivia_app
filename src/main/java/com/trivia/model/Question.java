package com.trivia.model;

import lombok.*;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Question {

    private static SimpleDateFormat datetimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Id
    @GeneratedValue
    private int id;

    private int quizId;

    private int questionNumber;

    private String question;

    private Date createdAt;

    @OneToMany(mappedBy = "question", fetch = FetchType.LAZY)
    private List<Answer> answers;

    public Question(int questionNumber, String questionText, String creation) {
        this.questionNumber = questionNumber;
        this.question = questionText;

        try {
            this.createdAt = datetimeFormat.parse(creation);
        } catch(Exception e) {
            this.createdAt = new Date();
        }
    }
}
