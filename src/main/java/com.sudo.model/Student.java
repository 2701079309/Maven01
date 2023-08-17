package com.sudo.model;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int id;
    private String student_name;
    private List<Stady> stadys= new ArrayList<Stady>();
    public Student(){}

    public int getId(int i) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent_name(String 李大哥) {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public List<Stady> getStadys() {
        return stadys;
    }

    public void setStadys(List<Stady> stadys) {
        this.stadys = stadys;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", student_name='" + student_name + '\'' +
                ", stadys=" + stadys +
                '}';
    }
}
