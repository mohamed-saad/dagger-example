package com.greeting.german;

import com.greeting.Bye;
import com.greeting.Person;

import javax.inject.Inject;

public class Wiedersehen implements Bye {

    @Inject
    public Wiedersehen() {
    }

    @Override
    public String sayBye(Person person) {
        return "Wiedersehen " + person.getName();
    }
}
