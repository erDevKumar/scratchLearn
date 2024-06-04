package com.scratchLearn.scratchLearn.serviceImpl;

import com.scratchLearn.scratchLearn.entites.Course;
import com.scratchLearn.scratchLearn.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl  implements CourseService {
    private List<Course> courses;
    public CourseServiceImpl(){
        courses=new ArrayList<>();
        courses.add(new Course(1,"Java","LearnJava"));
        courses.add(new Course(2,"Kotlin","LearnKotlin"));
    }
    @Override
    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public Course getCourse(Long id) {
        for (Course course:courses){
            if (course.getId()==id){
                return course;
            }
        }
        return null;
    }

    @Override
    public Course addCourse(Course course) {
        courses.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        for (Course course1:courses){
            if (course1.getId()==course.getId()){
                course1.setId(course.getId());
                course1.setTitle(course.getTitle());
                course1.setDescription(course.getDescription());
            }
        }
        return course;
    }

    @Override
    public boolean deleteCourse(long courseId) {
        for (Course course:courses) {
            if (course.getId() == courseId) {
                if ( courses.remove(course)){
                    return true;
                }
            }
        }
        return false;
    }
}
