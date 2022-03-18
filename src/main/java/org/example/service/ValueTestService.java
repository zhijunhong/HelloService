package org.example.service;

import org.example.model.Person2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValueTestService {
    @Autowired
    private Person2 person2;

    public Person2 getPerson2ObjectByValue() {
        return person2;
    }
}
