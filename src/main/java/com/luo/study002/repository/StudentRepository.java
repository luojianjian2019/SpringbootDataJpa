package com.luo.study002.repository;

import com.luo.study002.controller.response.StudentResponse;
import com.luo.study002.entity.StudentInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;

public interface StudentRepository extends JpaRepository<StudentInfo, Integer> {

    Page<StudentInfo> findAll(Specification<StudentInfo> specification, Pageable pageable);

    //多表查询 JPQL
    @Query(value = "select s.id,s.stu_no,s.stu_name,s.stu_sex,s.stu_age,s.stu_birthday,c.c_name,c.address" +
            "from student_info s,course c,stu_course_info sc where s.id = sc.s_id and c.id = sc.c_id and " +
            " (s.stu_no=:#{#studentInfo.stuNo} or :#{#studentInfo.stuNo} is null)",nativeQuery = true)
    Page<StudentResponse> findAllInfo(StudentInfo studentInfo, Pageable pageable);
}
