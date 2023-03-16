package com.softserve.edu08.privet;

public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person("Oleg", "Kostenko", 28);
        String fullName = String.valueOf(person.getFullName());
        int age = person.getAge();
        System.out.println(fullName + ", " + age + " years old");

    }
}
