package org.example.service;

import org.example.dao.TestMapperV2;
import org.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
 public class MySQLTestServiceV2 {

     @Autowired
     private TestMapperV2 testMapperV2;  //这里会有报错，不用管

     public List<Student> select() {
         return testMapperV2.select();
     }

     public int insert(int id, String name) {
         Student testModel = new Student();
         testModel.setId(id);
         testModel.setName(name);
         return testMapperV2.insert(testModel);
     }

    public int update(int id, String name) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        return testMapperV2.update(student);
    }
 }