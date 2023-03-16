package edu07.practical.task1;
public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("Bow-Wow!");
    }

    @Override
    public void feed() {
        System.out.println("It likes bones with meat.");
    }
}
