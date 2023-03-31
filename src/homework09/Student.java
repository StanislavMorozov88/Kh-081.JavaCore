package homework09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {

    @Override
    public int compareTo(Student o) {
        return 0;
    }

    public static class ByName implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return -o2.getName().compareTo(o1.getName());
        }
    }

    public static class ByCourse implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCourse() - o2.getCourse();
        }
    }

    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static void printStudents(List<Student> students) {
        List<Integer> courses = new ArrayList<>();
        for (Student student : students) {
            if (!courses.contains(student.getCourse())) {
                courses.add(student.getCourse());
            }
        }

        for (int course : courses) {
            System.out.println("Student is studying on course " + course + ":");
            for (Student student : students) {
                if (student.getCourse() == course) {
                    System.out.println(student.getName());
                }
            }
        }
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
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

}
