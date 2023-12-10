package com.traveller.spirtual.Controller;

import com.traveller.spirtual.Service.QuizSheetService;
import com.traveller.spirtual.dao.QuestionsEntity;
import com.traveller.spirtual.dao.QuizSheetsEntity;
import com.traveller.spirtual.dto.Questions;
import com.traveller.spirtual.dto.QuizSheets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class QuizSheetsController {

    @Autowired
    QuizSheetService service;

    @GetMapping("/quizsheet")
    public List<QuizSheetsEntity> getAllQuizSheet() {
        return service.retrieveAllQuizSheets();

    }

    @PostMapping("/enterSheets")
    public void enterQuizSheets(@RequestBody QuizSheets quizSheet){
        service.enterQuizSheet(quizSheet);

    }



}
