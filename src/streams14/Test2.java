package streams14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {

        Student st1 = new Student("Olha", 'f', 31, 1, 60.5);
        Student st2 = new Student("Oleh", 'm', 18, 2, 95.5);
        Student st3 = new Student("Alex", 'm', 38, 3, 90.5);
        Student st4 = new Student("Dmytro", 'm', 39, 4, 95.5);
        Student st5 = new Student("Anastasia", 'f', 25, 1, 82.5);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        System.out.println(students);

        students = students.stream()
                .filter(element -> element.getAge() > 25 && element.getAvgMark() >90)
                .collect(Collectors.toList());

        System.out.println("New list " + students);

        students = students.stream().sorted((x, y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());
        students = students.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
        System.out.println(students);

        Department d1 = new Department("Computer science");
        Department d2 = new Department("Applied math");

        d1.addStudentToDepartment(st1);
        d2.addStudentToDepartment(st2);
        d1.addStudentToDepartment(st3);
        d2.addStudentToDepartment(st4);
        d1.addStudentToDepartment(st5);

        List<Department> departmentList = new ArrayList<>();
        departmentList.add(d1);
        departmentList.add(d2);

        departmentList.stream().flatMap(department -> department.getStudentOnDepartment().stream())
                .forEach(e -> System.out.println(e.getName()));
    }
}
