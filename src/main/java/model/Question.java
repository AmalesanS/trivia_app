package model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class Question {
    Integer id;
    String question;
    String timestamp;
    List<Answer> answers;

    public Question(Integer id, String question, String timestamp) {
        this.id = id;
        this.question = question;
        this.timestamp = timestamp;
    }
}
