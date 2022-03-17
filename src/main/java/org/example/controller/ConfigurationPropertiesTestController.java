package org.example.controller;

import org.example.model.Person;
import org.example.service.ConfigurationPropertiesTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/configuration/properties")
public class ConfigurationPropertiesTestController {
    @Autowired
    public ConfigurationPropertiesTestService service;

    @RequestMapping("/person")
    public Person getPersonObjectFromConfigurationProperties() {
        return service.getPersonObject();
    }
}
