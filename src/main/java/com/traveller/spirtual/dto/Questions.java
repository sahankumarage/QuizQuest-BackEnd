package com.traveller.spirtual.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Questions {
    private int id;
    private String descQuiz;
    private String Answer1;
    private String Answer2;
    private String Answer3;
    private String Answer4;
    private String Answer5;
    private String correctAnswer;
}
