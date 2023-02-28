package com.softserve.lesson4.homeTask;

/**
 * This class can be used to create dogs
 */
public class Dog {

    private int age;
    private String name;

    private Breed breed;

    public Dog(int age, String name, Breed breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    enum Breed{
        BOSTON_TERRIER("Boston Terrier"),
        SHIH_TZU("Shih Tzu"),
        CAVALIER_SPANIEL("Cavalier King Charles Spaniel");

        Breed(String breed) {
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", breed=" + breed +
                '}';
    }
}
