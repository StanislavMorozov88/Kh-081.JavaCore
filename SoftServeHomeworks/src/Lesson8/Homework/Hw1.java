package Lesson8.Homework;

public class Hw1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(new FullName("Bob", "Smith"), 20,3);
        Student s2 = new Student(new FullName("Tod", "Brown"), 18,1);
        System.out.println(s1.info());
        System.out.println(s1.activity());
        System.out.println(s2.info());
        System.out.println(s2.activity());
        Student s1Clone = (Student) s1.clone();

        s1Clone.setCourse(88);

        System.out.println(s1.info());
        System.out.println(s2.info());
        System.out.println(s1Clone.info());
    }
}
