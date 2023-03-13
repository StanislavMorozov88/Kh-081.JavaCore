package com.softserve.lesson7.practicalTask.person;

public class Student extends Person{

    private static final String TYPE_OF_PERSON = "Student";

    public Student() {
        System.out.println(TYPE_OF_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_OF_PERSON);
    }
}
