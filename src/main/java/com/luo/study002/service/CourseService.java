package com.luo.study002.service;

import com.luo.study002.entity.Course;
import com.luo.study002.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course addCourse(Course course){
        return courseRepository.saveAndFlush(course);
    }
}
