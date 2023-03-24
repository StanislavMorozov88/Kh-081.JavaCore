package lesson10.additionalTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private int course;
    private double average;

    public Student(String name, int course, double average) {
        this.name = name;
        this.course = course;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverage() {
        return average;
    }

    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Olena", 2, 9.1),
                new Student("Poleno", 2, 2.8),
                new Student("Ihor", 1, 8.4),
                new Student("Bill", 5, 3),
                new Student("Jack", 2, 8.6)
        );

        List<Student> studentList = new ArrayList<>(list);
        System.out.print("Initial ");
        printStudentList(studentList);

        removeArageLessThanThree(studentList);
        System.out.print("\nAfter removing student with average less than 3 ");
        printStudentList(studentList);

        toNextCourse(studentList);
        System.out.print("\nAfter moving to the next course ");
        printStudentList(studentList);

        printStudentByCourse(studentList, 3);
        printStudentByCourse(studentList, 10);
    }

    public static void printStudentByCourse(List<Student> studentList, int course) {
        studentList.stream()
                .filter(student -> student.course == course)
                .findAny().ifPresentOrElse(student -> System.out.printf("Name: %s%n", student.getName()),
                        () -> System.out.println("No students in this course"));
    }

    public static void toNextCourse(List<Student> studentList) {
        for (Student student : studentList) {
            if (student.average >= 3) {
                student.course += 1;
            }
        }
    }

    public static void printStudentList(List<Student> studentList) {
        System.out.println("student list is: ");
        studentList.forEach(student -> System.out.printf("Name: %s, Course: %d, Average: %,.2f%n", student.getName(), student.getCourse(), student.getAverage()));
    }

    public static void removeArageLessThanThree(List<Student> studentList) {
        studentList.removeIf(student -> student.average < 3);
    }
}
