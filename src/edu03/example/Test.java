package edu02.example;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Ihor", 500.5f);
        Student s2 = new Student("Maryna", 90.5f);
        Student s3 = new Student("Mykola", 70.5f);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(Student.avrRating());

        System.out.println(s1.betterStudent(s3));

        System.out.println(Student.sumRating());
    }
}
