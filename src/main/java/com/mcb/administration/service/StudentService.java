package com.mcb.administration.service;

import com.mcb.administration.dao.StudentDao;
import com.mcb.administration.dao.StudentRepository;
import com.mcb.administration.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {

    StudentRepository repository;
    StudentDao studentDao;
    public StudentService(StudentRepository repository, StudentDao studentDao) {
    this.repository = repository;
    this.studentDao = studentDao;
    }

    public Student create(Student student) {
        Student s = repository.save(student);
        return student;
    }

    public List<Student> findAllFromTemplate() {
     return studentDao.findAll();
    }

    public  Student findById(String id) {
        return studentDao.findById(id);
    }

    public int deleteById(String id) {
        return studentDao.deleteById(id);
    }

    public int createUsingTemplate(Student student) {
        int s = studentDao.insert(student);
        return s;
    }

    public int updateUsingTemplate(String id, Student student) {
        int s = studentDao.update(id,student);
        return s;
    }
}
