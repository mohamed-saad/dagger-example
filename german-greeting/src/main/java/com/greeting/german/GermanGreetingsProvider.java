package com.greeting.german;

import com.greeting.Bye;
import com.greeting.Hi;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class GermanGreetingsProvider {

    @Binds
    abstract public Hi createHi(Hallo hallo);

    @Binds
    abstract public Bye createBye(Wiedersehen wiedersehen);

}
