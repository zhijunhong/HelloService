package org.example.controller;

import org.example.model.Person3;
import org.example.service.PropertySourceTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/property/source")
public class PropertySourceTestController {
    @Autowired
    private PropertySourceTestService propertySourceTestService;

    @RequestMapping("/person3")
    public Person3 testPropertySource() {
        return propertySourceTestService.getPerson3ByPropertySource();
    }
}
