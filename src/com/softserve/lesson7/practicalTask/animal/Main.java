package com.softserve.lesson7.practicalTask.animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Dog();

        for (Animal j : animals){
            j.voice();
            j.feed();
        }
    }
}
