package edu07.practice.people;

public class Student extends Person {
    public static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
}