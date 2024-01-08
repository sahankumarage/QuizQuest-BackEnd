package com.traveller.spirtual.Repository;

import com.traveller.spirtual.dao.SubjectEntity;
import com.traveller.spirtual.dto.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<SubjectEntity, Long> {

}
