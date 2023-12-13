package com.traveller.spirtual.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
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
