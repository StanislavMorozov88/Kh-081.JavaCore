package com.softserve.lesson10.homeTask;

import java.util.*;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void printStudents(List<Student> students, int course) {
        for(Iterator<Student> itr = students.iterator(); itr.hasNext();) {
            Student stud = itr.next();
            if(stud.getCourse() == course) {
                System.out.println(stud);
            }
        }
    }

    static class ComparatorStudents implements Comparator<Student>{

        @Override
        public int compare(Student s1, Student s2) {
            int byName = s1.getName().compareTo(s2.getName());
            if (byName == 0) {
                return s1.getCourse() - s2.getCourse();
            }
            return byName;
        }
    }

    static class CompareByCourse implements Comparator<Student>{

        @Override
        public int compare(Student s1, Student s2) {

            return s1.getCourse() - s2.getCourse();

        }
    }

    public static void sortByCourse(List<Student> students) {

        Collections.sort(students , new Student.CompareByCourse());
        System.out.println("by course: " + students);
    }

    public static void sortByNameAndCourse(List<Student> students) {

        Collections.sort(students , new Student.ComparatorStudents());
        System.out.println("by name and course: " + students);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 2));
        students.add(new Student("Jack", 3));
        students.add(new Student("Jason", 2));
        students.add(new Student("James", 1));
        students.add(new Student("Jordan", 4));
        students.add(new Student("Jamie", 4));
        students.add(new Student("Jamal", 3));
        students.add(new Student("Jameson", 2));
        students.add(new Student("Jill", 3));

        printStudents(students,4);
        sortByNameAndCourse(students);
        sortByCourse(students);
    }
}
