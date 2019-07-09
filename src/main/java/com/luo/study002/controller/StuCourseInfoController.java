package com.luo.study002.controller;

import com.luo.study002.entity.StuCourseInfo;
import com.luo.study002.service.StuCourseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value = "/stuCourseInfo")
public class StuCourseInfoController {

    @Autowired
    private StuCourseInfoService stuCourseInfoService;

    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> addStuCourseInfo(@RequestBody StuCourseInfo stuCourseInfo){
        StuCourseInfo info = stuCourseInfoService.addStuCourseInfo(stuCourseInfo);
        if (!StringUtils.isEmpty(info)){
            return new ResponseEntity<>("successful",HttpStatus.OK);
        }
        return new ResponseEntity<>("失败",HttpStatus.FAILED_DEPENDENCY);
    }
}
