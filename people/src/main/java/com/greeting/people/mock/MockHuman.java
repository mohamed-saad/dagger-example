package com.greeting.people.mock;

import com.greeting.Person;

import javax.inject.Inject;

public class MockHuman implements Person {

    @Inject
    public MockHuman(){
    }

    @Override
    public String getName() {
        return "dummy";
    }

}
