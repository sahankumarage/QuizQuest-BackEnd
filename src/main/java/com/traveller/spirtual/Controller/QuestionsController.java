package com.traveller.spirtual.Controller;


import com.traveller.spirtual.Service.QuestionsService;
import com.traveller.spirtual.dao.QuestionsEntity;
import com.traveller.spirtual.dao.StudentsEntity;
import com.traveller.spirtual.dto.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class QuestionsController {

    @Autowired
    QuestionsService service;

    @PostMapping("/enter")
    public void EnterQuiz(@RequestBody Questions quiz){
        service.enterQuestions(quiz);

    }

    @GetMapping("/quiz")
    public List<QuestionsEntity> getAllQuiz() {
        return service.retrieveAllQuestions();
    }


    @GetMapping("/question")
    public List<Questions> getAllQuestions() {
        return service.retrieveQuiz();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateQuestionsById(@PathVariable Long id, @RequestBody QuestionsEntity updatedQuestions) {
        service.updateQuestionsById(id, updatedQuestions);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}

