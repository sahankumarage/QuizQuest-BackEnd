package com.traveller.spirtual.Service;

import com.traveller.spirtual.Repository.StudentsRepository;
import com.traveller.spirtual.dao.QuestionsEntity;
import com.traveller.spirtual.dao.StudentsEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StudentsService {

    @Autowired
    StudentsRepository studentRepository;

    public List<StudentsEntity> retrieveAllStudents() {
        // Use the findAll() method provided by JpaRepository
        return (List<StudentsEntity>) studentRepository.findAll();
    }
}
