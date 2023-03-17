package lesson10.home.home03;

import java.util.ArrayList;
import java.util.List;

public class StudentListTest {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Bob Johnson", 10),
                new Student("Bill Gates", 10),
                new Student("Iren Irvin", 6),
                new Student("Tetiana Good", 5),
                new Student("Helen Yellow", 6),
                new Student("Helen Yellow", 10),
                new Student("Diana Sakhno", 7)
        );

        List<Student> studentList = new ArrayList<>(list);

        StudentService.printStudents(studentList, 10);
        studentList.sort(StudentService.getCourseComparator());
        System.out.println("studentList after sorting by course asc: " + studentList);

        studentList.sort(StudentService.getNameComparator());
        System.out.println("studentList after sorting by name asc:" + studentList);
    }
}
