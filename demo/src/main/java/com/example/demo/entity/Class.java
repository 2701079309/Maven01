package com.example.demo.entity;

import java.util.List;

public class Class {
    private Integer classId;

    private String className;
    private List<Student>liststudent;

    public List<Student> getListstudent() {
        return liststudent;
    }

    public void setListstudent(List<Student> liststudent) {
        this.liststudent = liststudent;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }
}