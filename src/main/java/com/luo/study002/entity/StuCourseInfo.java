package com.luo.study002.entity;

import javax.persistence.*;

@Entity
@Table(name = "stu_course_info")
public class StuCourseInfo {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 11)
    private Integer sId;

    @Column(length = 11)
    private Integer cId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }
}
