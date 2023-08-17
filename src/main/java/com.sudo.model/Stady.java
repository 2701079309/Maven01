package com.sudo.model;

public class Stady {
    private int stady_id;
    private String stady_name;
    private int student_id;
    public Stady(){

    }

    public Stady(int stady_id, String stady_name, int student_id) {
        this.stady_id = stady_id;
        this.stady_name = stady_name;
        this.student_id = student_id;
    }

    public int getStady_id() {
        return stady_id;
    }

    public void setStady_id(int stady_id) {
        this.stady_id = stady_id;
    }

    public String getStady_name() {
        return stady_name;
    }

    public void setStady_name(String stady_name) {
        this.stady_name = stady_name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    @Override
    public String toString() {
        return "Stady{" +
                "stady_id=" + stady_id +
                ", stady_name='" + stady_name + '\'' +
                ", student_id=" + student_id +
                '}';
    }
}
