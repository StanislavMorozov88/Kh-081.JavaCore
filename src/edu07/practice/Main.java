package edu07.practice;

import edu07.practice.animals.*;
import edu07.practice.people.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog(), new Cat(), new Dog()};
        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }

        Person[] people = {new Teacher("John"), new Cleaner("Alice"), new Student("Bob"), new Teacher("Mary")};
        for (Person person : people) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
        }
    }
}