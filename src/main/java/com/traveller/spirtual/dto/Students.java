package com.traveller.spirtual.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {

    private int id;
    private String name;
    private String dob;
    private String school;
    private String address;
    private String contact;
    private String img;
    private String alYear;
    private String alSubject;
}
