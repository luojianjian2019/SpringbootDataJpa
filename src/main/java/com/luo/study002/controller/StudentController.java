package com.luo.study002.controller;

import com.luo.study002.controller.response.StudentResponse;
import com.luo.study002.entity.StudentInfo;
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
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "getStudentByPage",method = RequestMethod.GET)
    @ResponseBody
    public List<StudentInfo> getStudentPage(int pageNo){
        Sort sort=new Sort(Sort.Direction.DESC,"stuBirthday");
        Pageable pageable=PageRequest.of(pageNo-1,2,sort);
        Page<StudentInfo> studentInfoPage = studentService.findAllByPage(pageable);
        return studentInfoPage.getContent();
    }

    @RequestMapping(value = "getStudentByPageSpec",method = RequestMethod.GET)
    @ResponseBody
    public List<StudentInfo> getStudentPageSpec(int pageNo,@RequestBody StudentInfo studentInfo){
        Sort sort=new Sort(Sort.Direction.DESC,"stuBirthday");
        Pageable pageable=PageRequest.of(pageNo-1,2,sort);
        Page<StudentInfo> studentInfoPage = studentService.findAllByPageSpec(pageable,studentInfo);
        return studentInfoPage.getContent();
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> addStudent(@RequestBody StudentInfo studentInfo){
        StudentInfo info = studentService.addStudent(studentInfo);
        if (!StringUtils.isEmpty(info)){
            return new ResponseEntity<>("successful",HttpStatus.OK);
        }
        return new ResponseEntity<>("失败",HttpStatus.FAILED_DEPENDENCY);
    }

    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    @ResponseBody
    public List<StudentResponse> findAllInfo(@RequestBody(required = false) StudentInfo studentInfo,int pageNo){
        Sort sort=new Sort(Sort.Direction.DESC,"stuBirthday");
        Pageable pageable=PageRequest.of(pageNo-1,2,sort);
        Page<StudentResponse> studentInfoPage = studentService.findAllInfo(studentInfo,pageable);
        return studentInfoPage.getContent();
    }
}
