package com.traveller.spirtual.dao.QuistionPapersDao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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



}
