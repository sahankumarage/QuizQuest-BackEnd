package com.traveller.spirtual.Controller;

import com.traveller.spirtual.Service.StudentsService;
import com.traveller.spirtual.dao.QuestionsEntity;
import com.traveller.spirtual.dao.Students;
import com.traveller.spirtual.dao.StudentsEntity;
import com.traveller.spirtual.dto.QuizSheets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class StudentsController {

    @Autowired
    StudentsService service;

    @GetMapping("/students")
    public List<StudentsEntity> getAllStudents() {
        return service.retrieveAllStudents();
    }

    @PostMapping("/enterStudent")
    public void enterStudent(@RequestBody StudentsEntity student){
        service.enterStudent(student);

    }

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable Long id) {
        service.deleteStudentById(id);
    }
}
