package lambda13;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentInfo {
    void printStudentsOverGrade(ArrayList<Student> all, double grade) {
        for (Student s : all) {
            if (s.averageGrade > grade) {
                System.out.println(s);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> all, int age) {
        for (Student s : all) {
            if (s.age<age) {
                System.out.println(s);
            }
        }
    }

    void printStudentsMixCondition(ArrayList<Student> all, int age, double grade, char sex) {
        for (Student s : all) {
            if (s.age>age && s.averageGrade<grade && s.sex == sex) {
                System.out.println(s);
            }
        }
    }
    void testStudents(ArrayList<Student> all,Predicate<Student> stud) {
        for (Student s : all) {
            if (stud.test(s)) {
                System.out.println(s);
            }
        }
    }
}
