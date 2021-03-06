package org.example.controller;

import org.example.model.Student;
import org.example.service.MySQLTestServiceV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Scope("prototype")
@RequestMapping("/mysql/test")
public class MySQLTestControllerV2 {

    @Autowired
    private MySQLTestServiceV2 mySQLTestServiceV2;

    @PostMapping(value = "/selectV2")
    public List<Student> select() throws Exception {
        return mySQLTestServiceV2.select();
    }

    @PostMapping(value = "/insertV2")
    public int insert(@RequestParam(value = "id") int id,
                      @RequestParam(value = "name") String name) throws Exception {
        return mySQLTestServiceV2.insert(id, name);
    }

    @PostMapping(value = "/update")
    public int update(@RequestParam(value = "id") int id, @RequestParam(value="name") String name)throws Exception {
        return mySQLTestServiceV2.update(id, name);
    }
}