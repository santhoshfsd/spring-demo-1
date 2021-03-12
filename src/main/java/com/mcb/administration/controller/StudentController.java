package com.mcb.administration.controller;

import com.mcb.administration.entity.Student;
import com.mcb.administration.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    public ResponseEntity create(Student student) {

        return new ResponseEntity(student, HttpStatus.CREATED);
    }
}
