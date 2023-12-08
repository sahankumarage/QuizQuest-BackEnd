package com.traveller.spirtual.Controller;

import com.traveller.spirtual.Service.StudentsService;
import com.traveller.spirtual.dao.QuestionsEntity;
import com.traveller.spirtual.dao.StudentsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class StudentsController {

    @Autowired
    StudentsService service;

    @GetMapping("/students")
    public List<StudentsEntity> getAllStudents() {
        return service.retrieveAllStudents();
    }
}
