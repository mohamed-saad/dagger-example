# Using Dagger for Dependency Injection
Dagger is a fully static, compile-time dependency injection framework for Java, Kotlin, and Android. 

# What is inside?

Five separate projects

- *greeting-api*   the API layer
- *people*  the Implementation layer with a mock and real implementation that are two alternatives that you can use only one of them at a time.
- *arabic-greeting*, *german-greeting*   the Implementation layer where arabic and german are two alternatives that you can use only one of them at a time. 
- *main-driver*  the Controller layer that uses Dagger to glue everthing together

# How to build it?

It is a gradle project :)
```
./gradlw build
```

# Playing with the code

Modify the following part inside `main-driver/src/main/java/DriverFactory.java` to switch between the factories
```
@Component(modules = {
    HumanProvider.class,
    ArabicGreetingsProvider.class
})
```
For example you can change it to
```
@Component(modules = {
        MockHumanProvider.class,
        GermanGreetingsProvider.class
})
```
