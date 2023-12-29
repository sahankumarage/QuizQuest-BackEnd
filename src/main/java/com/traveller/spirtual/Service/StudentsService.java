package com.traveller.spirtual.Service;

import com.traveller.spirtual.Repository.StudentsRepository;
import com.traveller.spirtual.dao.QuestionsEntity;
import com.traveller.spirtual.dao.Students;
import com.traveller.spirtual.dao.StudentsEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class StudentsService {

    @Autowired
    StudentsRepository studentRepository;

    public List<StudentsEntity> retrieveAllStudents() {
        // Use the findAll() method provided by JpaRepository
        return (List<StudentsEntity>) studentRepository.findAll();
    }

    public void enterStudent(StudentsEntity studentDetails) {
        StudentsEntity student = StudentsEntity.builder()
                .id(studentDetails.getId())
                .name(studentDetails.getName())
                .email(studentDetails.getEmail())
                .password(studentDetails.getPassword())
                .dob(studentDetails.getDob())
                .school(studentDetails.getSchool())
                .address(studentDetails.getAddress())
                .contact(studentDetails.getContact())
                .img(studentDetails.getImg())
                .alYear(studentDetails.getAlYear())
                .alSubject(studentDetails.getAlSubject())
                .build();

        studentRepository.save(student);
    }

    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    public void updateStudentById(Long id, StudentsEntity updatedStudent) {
        Optional<StudentsEntity> optionalStudent = studentRepository.findById(id);

        if (optionalStudent.isPresent()) {
            StudentsEntity student = optionalStudent.get();

            // Update fields only if they are not null in updatedStudent
            student.setName(updatedStudent.getName() != null ? updatedStudent.getName() : student.getName());
            student.setDob(updatedStudent.getDob() != null ? updatedStudent.getDob() : student.getDob());
            student.setSchool(updatedStudent.getSchool() != null ? updatedStudent.getSchool() : student.getSchool());
            student.setAddress(updatedStudent.getAddress() != null ? updatedStudent.getAddress() : student.getAddress());
            student.setContact(updatedStudent.getContact() != null ? updatedStudent.getContact() : student.getContact());
            student.setImg(updatedStudent.getImg() != null ? updatedStudent.getImg() : student.getImg());
            student.setAlYear(updatedStudent.getAlYear() != null ? updatedStudent.getAlYear() : student.getAlYear());
            student.setAlSubject(updatedStudent.getAlSubject() != null ? updatedStudent.getAlSubject() : student.getAlSubject());

            studentRepository.save(student);
            log.debug("Student with ID {} updated successfully.", id);
        } else {
            log.warn("Student with ID {} not found.", id);
        }
    }

}
