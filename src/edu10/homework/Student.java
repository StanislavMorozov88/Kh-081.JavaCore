package edu10.homework;

import java.util.*;

public class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            Student student = iter.next();
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.getName());
    }

    public static Comparator<Student> courseComparator = new Comparator<Student>() {
        @Override
        public int compare(Student student1, Student student2) {
            return Integer.compare(student1.getCourse(), student2.getCourse());
        }
    };
}
