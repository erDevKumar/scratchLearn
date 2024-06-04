package com.scratchLearn.scratchLearn.service;

import com.scratchLearn.scratchLearn.entites.Course;

import java.util.List;

public interface CourseService {
    List<Course> getCourses();
    Course getCourse(Long id);
    Course addCourse(Course course);
    Course updateCourse(Course course);
    boolean deleteCourse(long courseId);
}
