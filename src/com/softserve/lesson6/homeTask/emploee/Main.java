package com.softserve.lesson6.homeTask.emploee;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Ann", 1, 12);
        Employee e2 = new Developer("Dane", 2, 23, "Java dev");

        System.out.println(e1.report());
        System.out.println(e2.report());
    }
}
