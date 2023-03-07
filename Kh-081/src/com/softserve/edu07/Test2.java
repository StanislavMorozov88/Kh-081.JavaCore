package com.softserve.edu07;


import java.util.Arrays;

public class Test2 {
    public static void main(String[ ] args) {
        Student[] students = new Student[3];

        students[0] = new Student("Oksana", 28);
        students[1] = new Student("Bogdan",42);
        students[2] = new Student("Orest",17);

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

    }

}
