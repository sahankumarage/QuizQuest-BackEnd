package com.traveller.spirtual.Repository;

import com.traveller.spirtual.dao.MarksEntity;
import com.traveller.spirtual.dto.Marks;
import org.springframework.data.repository.CrudRepository;

public interface MarksRepository extends CrudRepository<MarksEntity, Long> {
}
