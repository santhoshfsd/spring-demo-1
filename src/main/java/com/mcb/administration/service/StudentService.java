package com.mcb.administration.service;

import com.mcb.administration.dao.StudentRepository;
import com.mcb.administration.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    StudentRepository repository;
    public StudentService(StudentRepository repository) {
    this.repository = repository;
    }

    public Student create(Student student) {
        Student s = repository.save(student);
        return student;
    }
}
