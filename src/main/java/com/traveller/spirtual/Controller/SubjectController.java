package com.traveller.spirtual.Controller;

import com.traveller.spirtual.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class SubjectController {

    @Autowired
    SubjectService service;

}
