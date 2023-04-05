package edu07.practice.people;

public class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }

    public void salary() {
        System.out.println("Calculating salary for " + TYPE_PERSON + " " + name);
    }
}