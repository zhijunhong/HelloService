package org.example.service;

import org.example.model.Person3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertySourceTestService {
    @Autowired
    private Person3 person3;

    public Person3 getPerson3ByPropertySource() {
        return person3;
    }
}
