package com.traveller.spirtual.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class StudentsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dob;
    private String school;
    private String address;
    private String contact;
    private String img;
    private String alYear;
    private String alSubject;

    @OneToOne(mappedBy = "students")
    private QuizSheetsEntity sheets;
}
