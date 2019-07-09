package com.luo.study002.controller.response;

import java.util.Date;

public class StudentResponse {

    private Integer id;
    private Integer stuNo;
    private String stuName;
    private Boolean stuSex;
    private Integer stuAge;
    private Date stuBirthday;
    private String cName;
    private String address;

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

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StudentResponse(Integer id, Integer stuNo, String stuName, Boolean stuSex, Integer stuAge, Date stuBirthday, String cName, String address) {
        this.id = id;
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.stuAge = stuAge;
        this.stuBirthday = stuBirthday;
        this.cName = cName;
        this.address = address;
    }
}
