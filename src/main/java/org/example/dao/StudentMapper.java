package org.example.dao;

import org.apache.ibatis.annotations.*;
import org.example.model.Student;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("select id,name from student")
    List<Student> select();

    @Insert("insert into student(name) values(#{name})")
    int insert(@Param("name") String name);
}