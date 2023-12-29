package com.traveller.spirtual.dao;

import com.traveller.spirtual.dao.QuestionsEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuizSheetsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quizSheetId;
    private String sheetsSubject;
    private String sheetLevel;
    private String postedBy;
    private int questions;


}