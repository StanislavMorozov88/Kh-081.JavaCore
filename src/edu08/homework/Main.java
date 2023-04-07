package edu08.homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(new FullName("Andrii", "Pasternak"), 20, 1));
        students.add(new Student(new FullName("Joe", "Tribianni"), 22, 2));

        for (Student student : students) {
            System.out.println(student.info());
            System.out.println(student.activity());
            System.out.println();
        }

        Student student3 = students.get(0).clone();
        student3.setCourse(3);
        students.add(student3);

        for (Student student : students) {
            System.out.println(student.info());
            System.out.println(student.activity());
            System.out.println();
        }
    }
}
