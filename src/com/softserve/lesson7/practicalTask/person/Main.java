package com.softserve.lesson7.practicalTask.person;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Student();
        people[1] = new Teacher();
        people[2] = new Cleaner();
        people[3] = new Student();
        people[4] = new Teacher();

        for (Person j : people) {
            j.print();
            if (j.getClass() == Teacher.class || j.getClass() == Cleaner.class){
                System.out.println("My salary is " + ((Stuff) j).salary());
            }
        }

    }
}
