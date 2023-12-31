package com.traveller.spirtual.dto;


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
public class Teacher {

    private int id;
    private String teacherName;
    private String teacherSubject;
    private String teachSchool;
    private String proImg;
    private String address;
    private String contact;


}
