package lambda13;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Function;

public class MainStudent {
    public static void main(String[] args) {
        Student st1 = new Student("Anna", 'f', 20, 3, 78.95);
        Student st2 = new Student("Olena", 'f', 22, 4, 88.5);
        Student st3 = new Student("Pavlo", 'm', 21, 3, 90.9);
        Student st4 = new Student("Yaroslav", 'm', 17, 1, 84.35);
        Student st5 = new Student("Ihor", 'm', 18, 2, 68.95);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();

//        info.printStudentsUnderAge(students,20);
//        info.printStudentsOverGrade(students,80.5);
//        info.printStudentsMixCondition(students,20,90,'f');
//
//        System.out.println("****");
//
//        info.testStudents(students, new CheckOverGrade());

//        info.testStudents(students, new StudentsCheck() {
//            @Override
//            public boolean check(Student s) {
//                return s.age>20;
//            }
//        });
//           info.testStudents(students, s -> s.age > 20);
//
//        Predicate<Student> p1 = student -> student.averageGrade > 85;
//        info.testStudents(students, p1);
//        System.out.println("***");
//        Predicate<Student> p2 = student -> student.age < 18;
//        info.testStudents(students,p2);
//        System.out.println("***");
//        Predicate<Student> p3 = student -> student.sex == 'm';
//        info.testStudents(students,p3);

        Function<Student,Double> func = student -> student.averageGrade;

        double res = average(students, stud->stud.averageGrade);
        System.out.println(res);

        double res1 = average(students, stud-> (double)stud.course);
        System.out.println(res1);
    }
    private static double average(ArrayList<Student>list, Function<Student,Double>func){
        double result = 0;
        for(Student st: list){
            result += func.apply(st);
        }
        result = result /list.size();
        return result;
    }
}
