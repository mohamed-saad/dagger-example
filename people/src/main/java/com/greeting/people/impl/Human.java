package com.greeting.people.impl;

import com.greeting.Person;

import javax.inject.Inject;

public class Human implements Person {

    private String name;

    @Inject
    public Human(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
