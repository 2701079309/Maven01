package com.sudo.model;


import java.util.ArrayList;
import java.util.List;

public class Cl {
    private int class_id;
    private  String class_name;
    private List<Student> students=new ArrayList<Student>();
    public Cl(){}

    public Cl(int class_id, String class_name, List<Student> students) {
        this.class_id = class_id;
        this.class_name = class_name;
        this.students = students;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "class_id=" + class_id +
                ", class_name='" + class_name + '\'' +
                ", students=" + students +
                '}';
    }
}
