package com.traveller.spirtual.Controller;

import com.traveller.spirtual.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TeacherController {

    @Autowired
    TeacherService service;
}
