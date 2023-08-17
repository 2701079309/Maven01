package com.sudo.model;

import java.util.Map;

public interface StudentDao1 {
    int  insertStudent(Student student);
    int deleteStudent(String student_id);
    public void StudentDao2(Map<String,Object>map);
}
