package com.traveller.spirtual.Repository;

import com.traveller.spirtual.dao.TeacherEntity;
import com.traveller.spirtual.dto.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<TeacherEntity,Long> {

}
