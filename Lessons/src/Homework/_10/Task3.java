package Homework._10;

import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 1));
        students.add(new Student("Elise", 3));
        students.add(new Student("Bob", 2));
        students.add(new Student("John", 3));
        students.add(new Student("Peter", 2));
        students.add(new Student("Van Gogh", 1));
        students.add(new Student("Jessica", 4));

        System.out.println("Students sorted by course:");
        students.sort(Student::compareByCourse);
        System.out.println(students + "\n");

        System.out.println("Students sorted by name:");
        students.sort(Student::compareByName);
        System.out.println(students + "\n");

        Student.printStudents(students, 2);
    }
}

class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.course = course;
        this.name = name;
    }

    public static void printStudents(List students, Integer course) {
        Iterator<Student> iterator = students.iterator();
        Student st;
        System.out.println("The following number of students study in year \033[0;36m" + course + "\033[0m:");
        while (iterator.hasNext()) {
            st = iterator.next();
            if (st.getCourse() == course) {
                System.out.println("\t- " + st.getName() + ";");
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

    public int compareByName(@NotNull Student o) {
        if (getName().equals(o.getName())) {
            return Integer.compare(this.getCourse(), o.getCourse());
        }
        return getName().compareTo(o.getName());
    }

    public int compareByCourse(@NotNull Student o) {
        if (this.getCourse() == o.getCourse()) {
            return getName().compareTo(o.getName());
        }
        return Integer.compare(this.getCourse(), o.getCourse());
    }

    @Override
    public String toString() {
        return "course \033[0;36m" + course + "\033[0m: " +
                "\033[0;36m" + name +
                "\033[0m";
    }
}

/*
 * Write class Student that provides information about the name of the student and his course.
 * Class Student should consist of:
 *
 * properties for access to these fields
 * constructor with parameters
 *
 * method printStudents (List students, Integer course), which receives a list of students
 * and the course number and prints to the console the names of the students from the list,
 * which are taught in this course (use an iterator)
 *
 * methods to compare students by name and by course
 *
 * In the main() method declare List students and add to the list five different students
 * display the list of students ordered by name
 * display the list of students ordered by course.
 */