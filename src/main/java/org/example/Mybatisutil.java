package org.example;


import com.sudo.model.Circle;
import com.sudo.model.Rectangle;
import com.sudo.model.Student;
import com.sudo.model.Well;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mybatisutil {
  public static void main(String[] args) throws IOException {

      SqlSessionFactory sqlSessionFactory;
          String resource = "mybatis-config.xml";
          InputStream inputStream = Resources.getResourceAsStream(resource);
          sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession session = sqlSessionFactory.openSession();
       Rectangle rt= new Rectangle();
       rt.setOrg("中国移动");
       rt.setType((byte)1);
       rt.setLength(30);
       rt.setWidth(40);


       Rectangle rt1 =new Rectangle();
       rt1.setOrg("中国联通");
       rt1.setType((byte)1);
       rt1.setLength(40);
       rt1.setWidth(60);

       List<Rectangle> datas = new ArrayList<Rectangle>();
       datas.add(rt);
       datas.add(rt1);
       String stement="com.cn.WellMapper.insertWell";
       session.insert(stement,datas);
       session.commit();
//    List<Student>students =session.selectList("com.cn.UserMapper.selectstady");
//      System.out.println(students);

//      List<Cl>clas =session.selectList("com.cn.ClMapper.selectclass");
//      System.out.println(clas);
//      List<Well>wells = session.selectList("com.cn.WellMapper.listWell",(byte)2);
//      System.out.println(wells);
//      for(Well we : wells){
//          if(we instanceof Rectangle){
//              System.out.println("======="+we);
//          } else if (we instanceof Circle) {
//              System.out.println("*****"+we);
//
//          }
//      }


//      Map sep = new HashMap();
//      sep.put("id","2002");
////      sep.put("student_name","李四");
//      Map st =(Map)session.selectOne("com.cn.UserMapper.selectStudent",sep);
//      System.out.println(st);
//        Student student = session.selectOne("com.cn.UserMapper.selectstudentclass1", 2002);
//        System.out.println(student);

//    StudentDao1 mapper = session.getMapper(StudentDao1.class);
//////     int res = mapper.insertStudent(new Student("3","安吊毛",11));
//      HashMap<String,Object>mpp = new HashMap<String, Object>();
////      mpp.put("student_id","1");
//      mpp.put("student_name","荔枝姐");
//      mpp.put("class_id",11);
//      mapper.StudentDao2(mpp);
//      session.commit();
    session.close();


//      StudentDao mapper1 = session.getMapper(StudentDao.class);
//      mapper1.deleteStudent("2001");
//      session.commit();
//      session.close();
  }
    }
