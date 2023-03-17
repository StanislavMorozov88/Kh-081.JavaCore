package edu08.homework;

public class task1 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student student1 = new Student(new FullName("Ihor", "Dzheva"), 22, 5);
        Student student2 = new Student(new FullName("Oleksiy", "Shevchenko"), 20, 2);

        //System.out.println("Student#1 — " + student1.info() + " Activity: " + student1.activity());
        //System.out.println("Student#2 — " + student2.info() + " Activity: " + student2.activity());

        Student student3 = (Student) student1.clone();
        student3.setCourse(4);

        System.out.println("Student#1 — " + student1.info() + " Activity: " + student1.activity());
        System.out.println("Student#2 — " + student2.info() + " Activity: " + student2.activity());
        System.out.println("Student#3 — " + student3.info() + " Activity: " + student3.activity());

    }
}
