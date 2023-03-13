package com.softserve.lesson7.practicalTask.animal;

public class Dog implements Animal{
    public Dog() {
    }

    @Override
    public void voice() {
        System.out.println("Bow-wow");
    }

    @Override
    public void feed() {
        System.out.println("Meat");
    }
}
