package org.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/index")
public class IndexController {
    @GetMapping(path = "")
    public String index(){
        Logger logger = LoggerFactory.getLogger(IndexController.class);
        //调用 sl4j 的 info() 方法，而非调用 logback 的方法
        logger.info("Hello World");

        return "Hello Spring Boot!";
    }
}