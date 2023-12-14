package com.traveller.spirtual.Service;

import com.traveller.spirtual.Repository.SubjectRepository;
import com.traveller.spirtual.dao.SubjectEntity;
import com.traveller.spirtual.dto.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    @Autowired
    SubjectRepository repository;

    public void enterSubject(SubjectEntity subject){

    }



}
