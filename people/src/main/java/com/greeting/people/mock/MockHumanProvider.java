package com.greeting.people.mock;

import com.greeting.Person;
import com.greeting.people.impl.Human;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MockHumanProvider {

    @Binds
    abstract Person createHuman(MockHuman mockHuman);

}
