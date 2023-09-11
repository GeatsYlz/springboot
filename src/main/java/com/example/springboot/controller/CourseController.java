package com.example.springboot.controller;

import com.example.springboot.mapper.CourseMapper;
import com.example.springboot.model.Course;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 功能：
 * 作者：俞凌志
 * 日期： CourseController CourseController
 */
@CrossOrigin("*")
@RestController
public class CourseController {

    @Autowired
    CourseMapper courseMapper;
    Gson gson = new Gson();

    @GetMapping("/course")
    public String getCourseList() {
        List<Course> courseList = courseMapper.selectList(null);
        return gson.toJson(courseList);
    }

    @PostMapping("/addcourse")
    public void AddStudent(@RequestBody Course course){
        courseMapper.insert(course);
    }

    @DeleteMapping("/deletecourse")
    public void DeleteStudent(@RequestBody Course course){
        courseMapper.deleteById(course);
    }

    @PutMapping("/updatecourse")
    public void UpdateStudent(@RequestBody Course course){
        courseMapper.updateById(course);
    }

}
