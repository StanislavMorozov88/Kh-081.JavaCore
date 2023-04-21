package edu10.homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("John", 1));
        students.add(new Student("Jane", 2));
        students.add(new Student("Bob", 1));
        students.add(new Student("Alice", 3));
        students.add(new Student("Dave", 2));

        // list by name
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }

        // list by course
        Collections.sort(students, Student.courseComparator);
        for (Student student : students) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }

        // students in 2 course
        System.out.println("Students in Course 2:");
        Student.printStudents(students, 2);
    }
}
