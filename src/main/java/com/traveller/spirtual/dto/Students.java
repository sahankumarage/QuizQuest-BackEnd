package com.traveller.spirtual.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Students {

    private int id;
    private String name;
    private String email;
    private String password;
    private String dob;
    private String school;
    private String address;
    private String contact;
    private String img;
    private String alYear;
    private String alSubject;
}
