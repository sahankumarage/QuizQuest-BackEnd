package com.traveller.spirtual.Service;

import com.traveller.spirtual.Repository.MarksRepository;
import com.traveller.spirtual.dao.MarksEntity;
import com.traveller.spirtual.dao.QuestionsEntity;
import com.traveller.spirtual.dao.StudentsEntity;
import com.traveller.spirtual.dto.Marks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarksService {

    @Autowired
    MarksRepository repository;

    public void enterMarks(Marks marks){

    }

    public List<MarksEntity> getAllMarks(){
        return (List<MarksEntity>) repository.findAll();
    }


}
