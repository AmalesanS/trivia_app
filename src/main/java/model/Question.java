package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "question")
public class Question {
    @Id
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
