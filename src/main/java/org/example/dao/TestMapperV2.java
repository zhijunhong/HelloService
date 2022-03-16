package org.example.dao;

import org.example.model.Student;

import java.util.List;


public interface TestMapperV2 {

    List<Student> select();

    int insert(Student testModel);
}