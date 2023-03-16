package edu07.practical.task1;

public class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("Meow-Meow!");
    }

    @Override
    public void feed() {
        System.out.println("It likes milk.");
    }
}
