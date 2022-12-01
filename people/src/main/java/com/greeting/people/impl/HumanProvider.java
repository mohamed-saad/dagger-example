package com.greeting.people.impl;

import com.greeting.Person;
import dagger.Module;
import dagger.Provides;

@Module
public class HumanProvider {

    public static final String[] randomNames = new String[] { "Killian Ashley","Elsie Davies","Noe Haney","Dania Everett","Jakobe Chandler",
            "Addison Klein","Keyon Stevens","Brooklynn Mcdonald","Lucas Grant","Anya Hess","Brooklynn Hernandez","Rogelio Rivers",
            "Elisabeth Henson","Heather Rollins","Nickolas Hartman","Carter Acevedo","Gordon Walters","Christopher Mcdaniel","Lillian Oneal",
            "Marlon Frey","Christine Wagner","Alexia Ware","Royce Barker","Lydia Garrett","Mariana Potts","Amiya Mcpherson","Jovanni Fritz",
            "Tatum Best","Jackson Torres","Katie Clayton","Sanai Case","Leslie Beard","Moises Hendricks","Maleah Wiggins","Finn Shannon",
            "Frankie Jordan","Lucas Nunez","Warren Paul","Isabela Harrington","Amina Weeks","Darwin Galloway","Gustavo Hickman","Howard Wright",
            "Nylah Valentine","Elyse Hernandez","Sanai Woodward","Cecilia Vaughan","Iyana Mckinney","Diamond Avery","Matias Sharp",};


    @Provides
    Person createHuman() {
        return new Human(randomNames[(int)(Math.random() * randomNames.length)]);
    }

}
