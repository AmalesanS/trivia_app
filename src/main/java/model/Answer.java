package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "answer")
public class Answer {
    @Id
    private Integer id;
    @ManyToOne
    @Column(name = "question")
    private Question question;
    private char choice;
    private String answer;
    private boolean correct;

    public Answer(Question question, char choice, String answer, boolean correct) {
        this.question = question;
        this.choice = choice;
        this.answer = answer;
        this.correct = correct;
    }
}
