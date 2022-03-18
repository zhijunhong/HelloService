package org.example.controller;

import org.example.model.Person2;
import org.example.service.ValueTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/person2")
public class ValueTestController {

    @Autowired
    public ValueTestService valueTestService;

    @RequestMapping("/value")
    public Person2 testValue() {
        return valueTestService.getPerson2ObjectByValue();
    }
}
