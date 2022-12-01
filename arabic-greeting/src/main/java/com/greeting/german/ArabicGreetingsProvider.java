package com.greeting.german;

import com.greeting.Bye;
import com.greeting.Hi;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class ArabicGreetingsProvider {

    @Binds
    abstract public Hi createHi(Salam salam);

    @Binds
    abstract public Bye createBye(Salam salam);

}
