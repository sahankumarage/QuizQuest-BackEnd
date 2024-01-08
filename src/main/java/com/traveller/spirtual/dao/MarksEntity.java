package com.traveller.spirtual.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.IdGeneratorType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MarksEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long markId;
    private int marks;



}
