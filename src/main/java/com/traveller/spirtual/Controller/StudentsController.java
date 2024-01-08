package com.traveller.spirtual.Controller;

import com.traveller.spirtual.Service.StudentsService;
import com.traveller.spirtual.dao.QuestionsEntity;
import com.traveller.spirtual.dao.Students;
import com.traveller.spirtual.dao.StudentsEntity;
import com.traveller.spirtual.dto.QuizSheets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateStudentById(@PathVariable Long id, @RequestBody StudentsEntity updatedStudent) {
        service.updateStudentById(id, updatedStudent);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable Long id) {
        service.deleteStudentById(id);
    }
}
