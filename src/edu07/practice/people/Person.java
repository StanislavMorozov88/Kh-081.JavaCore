package edu07.practice.people;

public abstract class Person {
    protected String name;
    public static final String TYPE_PERSON = "Person";

    public Person(String name) {
        this.name = name;
        System.out.println(name + " is a " + TYPE_PERSON);
    }

    public abstract void print();
}