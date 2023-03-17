package lesson10.home.home03;

import java.util.Objects;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        checkName(name);
        checkCourse(course);
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void checkName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is null or empty");
        }
    }

    public void checkCourse(int course) {
        if (course <= 0) {
            throw new IllegalArgumentException("Course is negative or 0");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "Student[" +
                "name: '" + name + '\'' +
                ", course: " + course +
                ']';
    }
}
