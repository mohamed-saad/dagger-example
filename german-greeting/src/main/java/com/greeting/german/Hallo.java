package com.greeting.german;

import com.greeting.Hi;
import com.greeting.Person;

import javax.inject.Inject;

public class Hallo implements Hi {

    @Inject
    public Hallo() {
    }

    @Override
    public String sayHi(Person person) {
        return "Hallo " + person.getName();
    }
}
