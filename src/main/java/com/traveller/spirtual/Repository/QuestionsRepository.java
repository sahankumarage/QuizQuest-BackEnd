package com.traveller.spirtual.Repository;

import com.traveller.spirtual.dao.QuestionsEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionsRepository extends CrudRepository<QuestionsEntity,Long> {
     List<QuestionsEntity> findAll();

}
