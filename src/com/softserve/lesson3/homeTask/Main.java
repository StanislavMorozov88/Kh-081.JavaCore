package com.softserve.lesson3.homeTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Ivan", "Terepa", 2001);
        Person p2 = new Person("Andrew", "Hoking", 1987);
        Person p3 = new Person();
        Person p4 = new Person("Anna", "Marsh");
        Person p5 = new Person("Alexandra", "Galych");

        p3.input("Ksenia", "Koval", 1999);
        p4.setBirthYear(2004);
        p5.setBirthYear(1976);
        p2.changeName("Andrew", "Schwitz");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p1.getAge());
        System.out.println(p2.getAge());
        System.out.println(p3.getAge());
        System.out.println(p4.getAge());
        System.out.println(p5.getAge());


    }
}
