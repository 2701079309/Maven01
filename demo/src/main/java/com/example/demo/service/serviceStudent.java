package com.example.demo.service;

import com.example.demo.dao.StudentMapper;
import com.example.demo.dao.infaceStudent;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class serviceStudent implements infaceStudent {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> listStudent() {
        List<Student> datas=this.studentMapper.listStudent();
        return datas;
    }
}
