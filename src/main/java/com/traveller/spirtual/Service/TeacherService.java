package com.traveller.spirtual.Service;

import com.traveller.spirtual.Repository.TeacherRepository;
import com.traveller.spirtual.dao.TeacherEntity;
import com.traveller.spirtual.dto.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository repository;

    public void enterTeacher(TeacherEntity teacher) {
        TeacherEntity teach = new TeacherEntity();
        teach.setTeacherName(teacher.getTeacherName());
        teach.setTeacherSubject(teacher.getTeacherSubject());
        teach.setTeachSchool(teacher.getTeachSchool());
        teach.setProImg(teacher.getProImg());
        teach.setAddress(teacher.getAddress());
        teach.setContact(teacher.getContact());

        repository.save(teach);
    }


    public List<TeacherEntity> getTeachers() {
        return (List<TeacherEntity>) repository.findAll();
    }
}
