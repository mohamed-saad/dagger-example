package com.greeting.german;

import com.greeting.Bye;
import com.greeting.Hi;
import com.greeting.Person;

import javax.inject.Inject;

public class Salam implements Hi, Bye {

    @Inject
    public Salam() {
    }

    @Override
    public String sayBye(Person person) {
        return "Salam " + person.getName();
    }

    @Override
    public String sayHi(Person person) {
        return "Salam " + person.getName();
    }
}
