package com.example.demo.service;

import com.example.demo.dao.Ifsstudent;
import com.example.demo.dao.WellMapper;
import com.example.demo.entity.Well;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services implements Ifsstudent {
   @Autowired
   private WellMapper wellMapper;
   @Override
   public List<Well> listwell() {
      List<Well> data=this.wellMapper.listwell();
      return data;
   }

   public Student queryStudentById(int id){
      Student student =new Student();
      student.setId(1);
      student.setName("张三");
      return student;
   }


}
