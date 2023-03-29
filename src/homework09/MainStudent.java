package homework09;

import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Petro", 2));
        students.add(new Student("Olha", 3));
        students.add(new Student("Vitalii", 1));
        students.add(new Student("Victoriia", 3));
        students.add(new Student("Ihor", 2));

        System.out.println(students);
        System.out.println("-------------------------------------------------------");
        System.out.println("Sorted students by course:");
        students.sort(new Student.byCourse());
        System.out.println(students);
        System.out.println("-------------------------------------------------------");
        students.sort(new Student.ByName());

        System.out.println("The list of students sorted by name:");
        for (Student student : students){
            System.out.println(student);
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Method printStudents:");
        Student.printStudents(students);

    }
}
