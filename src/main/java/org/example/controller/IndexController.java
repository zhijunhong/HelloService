package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/index")
public class IndexController {
    @GetMapping(path = "")
    public String index(){
        return "Hello Spring Boot!";
    }
}