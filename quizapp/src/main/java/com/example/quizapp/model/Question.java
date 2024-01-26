package com.example.quizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Question_Title;
    private String option1;
    private String Option2;
    private String Option3;
    private String Option4;
    private String correct_answer;
    private String difficulty_level;
    private String category;

}
