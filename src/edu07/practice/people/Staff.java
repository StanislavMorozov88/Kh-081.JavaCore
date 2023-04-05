package edu07.practice.people;

public abstract class Staff extends Person {
    public Staff(String name) {
        super(name);
    }

    public abstract void salary();
}