package com.traveller.spirtual.Service;

import com.traveller.spirtual.Repository.TeacherRepository;
import com.traveller.spirtual.dao.TeacherEntity;
import com.traveller.spirtual.dto.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository repository;

    public void enterTeacher(TeacherEntity teacher){

    }

}
