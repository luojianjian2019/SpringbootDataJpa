package com.luo.study002.service;

import com.luo.study002.entity.StuCourseInfo;
import com.luo.study002.repository.StuCourseInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuCourseInfoService {

    private final StuCourseInfoRepository stuCourseInfoRepository;

    @Autowired
    public StuCourseInfoService(StuCourseInfoRepository stuCourseInfoRepository) {
        this.stuCourseInfoRepository = stuCourseInfoRepository;
    }

    public StuCourseInfo addStuCourseInfo(StuCourseInfo stuCourseInfo){
        return stuCourseInfoRepository.saveAndFlush(stuCourseInfo);
    }
}
