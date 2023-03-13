package com.softserve.lesson7.practicalTask.person;

public class Teacher extends Stuff{

    private static final String TYPE_OF_PERSON = "Teacher";

    public Teacher() {
        System.out.println(TYPE_OF_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_OF_PERSON);
    }

    @Override
    public double salary() {
        return 40.00;
    }
}
