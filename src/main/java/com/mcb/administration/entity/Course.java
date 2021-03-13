package com.mcb.administration.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
@Data
public class Course {

    @Id
    private int id;
    private String departmentName;
    private int instructorId;
    private int duration;
    private String name;

}
