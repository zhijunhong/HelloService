package org.example.service;

import org.example.dao.StudentMapper;
import org.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MySQLTestService {

    @Autowired
    private StudentMapper studentMapper;  //这里会有报错，不用管

    public List<Student> select() {
        return studentMapper.select();
    }

    public int insert(String name) {
        return studentMapper.insert(name);
    }
}