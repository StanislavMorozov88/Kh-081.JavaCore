package com.softserve.lesson7.practicalTask.person;

public class Cleaner extends Stuff{
    private static final String TYPE_OF_PERSON = "Cleaner";

    public Cleaner() {
        System.out.println(TYPE_OF_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_OF_PERSON);
    }

    @Override
    public double salary() {
        return 30.00;
    }
}
