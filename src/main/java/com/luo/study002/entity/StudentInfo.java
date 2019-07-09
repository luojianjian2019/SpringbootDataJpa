package com.luo.study002.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student_info")
public class StudentInfo {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 10)
    private Integer stuNo;

    @Column(length = 50)
    private String stuName;

    @Column
    private Boolean stuSex;

    @Column
    private Integer stuAge;

    @Column
    private Date stuBirthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStuNo() {
        return stuNo;
    }

    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Boolean getStuSex() {
        return stuSex;
    }

    public void setStuSex(Boolean stuSex) {
        this.stuSex = stuSex;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public Date getStuBirthday() {
        return stuBirthday;
    }

    public void setStuBirthday(Date stuBirthday) {
        this.stuBirthday = stuBirthday;
    }
}
