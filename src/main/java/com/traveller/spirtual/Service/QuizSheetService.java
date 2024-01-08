package com.traveller.spirtual.Service;

import com.traveller.spirtual.Repository.QuestionsRepository;
import com.traveller.spirtual.Repository.QuizSheetRepository;
import com.traveller.spirtual.dao.QuestionsEntity;
import com.traveller.spirtual.dao.QuizSheetsEntity;
import com.traveller.spirtual.dao.StudentsEntity;
import com.traveller.spirtual.dto.Questions;
import com.traveller.spirtual.dto.QuizSheets;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class QuizSheetService {

    @Autowired
    QuizSheetRepository quizRepository;

    public List<QuizSheetsEntity> retrieveAllQuizSheets() {
        // Use the findAll() method provided by JpaRepository
        return (List< QuizSheetsEntity>) quizRepository.findAll();
    }

    public void enterQuizSheet(QuizSheets quizSheets) {
        QuizSheetsEntity quizSheetEntity = QuizSheetsEntity.builder()
                .sheetsSubject(quizSheets.getSheetsSubject())
                .sheetLevel(quizSheets.getSheetLevel())
                .postedBy(quizSheets.getPostedBy())
                .build();

        quizRepository.save(quizSheetEntity);
    }

    public void deleteQuizById(Long id){quizRepository.deleteById(id);}



}
