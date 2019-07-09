package com.luo.study002.controller;

import com.luo.study002.entity.Course;
import com.luo.study002.entity.StudentInfo;
import com.luo.study002.service.CourseService;
import com.luo.study002.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> addCourse(@RequestBody Course course){
        Course info = courseService.addCourse(course);
        if (!StringUtils.isEmpty(info)){
            return new ResponseEntity<>("successful",HttpStatus.OK);
        }
        return new ResponseEntity<>("失败",HttpStatus.FAILED_DEPENDENCY);
    }
}
