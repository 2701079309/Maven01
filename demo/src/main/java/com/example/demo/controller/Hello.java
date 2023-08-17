package com.example.demo.controller;

import com.example.demo.config.SpringUtil;
import com.example.demo.dao.ClassMapper;
import com.example.demo.dao.WellMapper;
import com.example.demo.dao.infaceStudent;
import com.example.demo.entity.Well;

//import com.example.demo.service.Services;
import com.example.demo.service.Services;
import com.example.demo.service.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class Hello {
    @Autowired
    private Services ss;
    @DeleteMapping("/boot/{id}/{name}")
    public Student hello(@PathVariable int id,@PathVariable String name){
        Student st=(Student) SpringUtil.getApplicationContext().getBean("mystudent",Student.class);
       return st;
    }//RequestParam
    @PostMapping("/world")
    public String map(@RequestBody String ss){
//        Map<String,String>m=new HashMap<>();
//        m.put("name","张三");
//        m.put("key","2022");
        return ss;
    }

//    @Autowired
//     teacher t;
//    @GetMapping("/teacher")
//    public teacher testtacher( teacher t){
//       t.getId();
//       t.getName();
//       return t;
//    }
    @GetMapping("/w")
    public Student studentException() throws IOException {
        throw new IOException("ioexception");
    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public Map<String,Object> map(){
        Map<String,Object> map =new HashMap<>();
        map.put("erroring","------不存在");
        return map;
    }
    @Autowired
    private WellMapper wellMapper;
   @GetMapping("/h")
    public List<Well> listStudent(){
       System.out.println("***");
      return this.wellMapper.listwell();

   }
   @Autowired
    private ClassMapper classMapper;
   @GetMapping("/c")
   public List<com.example.demo.entity.Student> liststudent(){
       return this.classMapper.liststudent();
   }
       @Autowired
    private infaceStudent infaceStudent;
   @GetMapping("/stu")
    public List<com.example.demo.entity.Student>studentList(){
       return this.infaceStudent.listStudent();
   }

//http://localhost:8080/hello/boot/id/name
}
