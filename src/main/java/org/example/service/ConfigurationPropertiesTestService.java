package org.example.service;

import org.example.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationPropertiesTestService {
    @Autowired
    private Person person;

    public Person getPersonObject(){ return person;}

}
