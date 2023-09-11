package com.example.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 功能：
 * 作者：俞凌志
 * 日期： Course Course
 */
@Data
@AllArgsConstructor
public class Course {
    private String id;
    private String name;
    private double credit;
}
