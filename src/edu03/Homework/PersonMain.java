package edu03.Homework;

import java.util.Arrays;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person("Mykola", "Hnii");
        Person person4 = new Person("Stepan", "Chort");
        Person person5 = new Person("Ivan", "Gey");

        person1.input();
        person2.input();
        for (Person person : Arrays.asList(person3, person4)) {
            person.setBirthYear();
        }
        person5.changeName(" ", "");
        System.out.println();

        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();

    }
}
