package com.traveller.spirtual.Controller;

import com.traveller.spirtual.Service.TeacherService;
import com.traveller.spirtual.dao.TeacherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class TeacherController {

    @Autowired
    TeacherService service;

    @GetMapping("/getTeacher")
    public List<TeacherEntity> getTeacher(){
        return service.getTeachers();
    }

    @PostMapping("/enterTeacher")
    public void enterTeacher(@RequestBody TeacherEntity teacher){
        service.enterTeacher(teacher);
    }
}
