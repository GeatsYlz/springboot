package com.example.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 功能：
 * 作者：俞凌志
 * 日期： Student Student
 */
@Data
@AllArgsConstructor
public class Student {
    private String id;
    private String name;
    private String gender;
    private double gpa;
}
