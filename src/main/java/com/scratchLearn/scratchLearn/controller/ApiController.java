package com.scratchLearn.scratchLearn.controller;

import com.scratchLearn.scratchLearn.entites.Course;
import com.scratchLearn.scratchLearn.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class ApiController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to spring boot learning.";
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable("courseId") Long courseId){
        return courseService.getCourse(courseId);
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public Boolean deleteCourse(@PathVariable("courseId") long courseId){
        return courseService.deleteCourse(courseId);
    }
}
