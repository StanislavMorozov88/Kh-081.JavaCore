package com.softserve.lesson7.practicalTask.animal;

public class Cat implements Animal{
    public Cat() {
    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void feed() {
        System.out.println("Fish");
    }
}
