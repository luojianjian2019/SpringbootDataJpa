package com.luo.study002.service;

import com.luo.study002.controller.response.StudentResponse;
import com.luo.study002.entity.StudentInfo;
import com.luo.study002.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Page<StudentInfo> findAllByPage(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    public Page<StudentInfo> findAllByPageSpec(Pageable pageable, StudentInfo studentInfo) {
        //规格定义
        Specification specification = new Specification() {
            /**
             *
             * @param root 实体对象引用
             * @param criteriaQuery 规则查询对象
             * @param criteriaBuilder 规则构建对象
             * @return 断言
             */
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                Optional.ofNullable(studentInfo.getStuSex()).map(it ->
                        predicates.add(criteriaBuilder.equal(root.get("stuSex"), it)));
                return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
            }
        };
        return studentRepository.findAll(specification,pageable);
    }

    public StudentInfo addStudent(StudentInfo studentInfo){
        return studentRepository.saveAndFlush(studentInfo);
    }

    public Page<StudentResponse> findAllInfo(StudentInfo studentInfo,Pageable pageable){
        return studentRepository.findAllInfo(studentInfo,pageable);
    }
}
