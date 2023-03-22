package com.softserve.lesson8.homeTask;

public class Student extends Person implements Cloneable{
    private int course;

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(new FullName("Jack", "Smith"), 15, 1);
        Student student3 = new Student(new FullName("Malenia", "Smith"), 150, 5);
        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println("***-***-***-***-***");

        System.out.println(student3.info());
        System.out.println(student3.activity());

        System.out.println("***-***-***-***-***");

        Student student2 = student1.clone();
        student2.setCourse(2);
        System.out.println(student2.info());
        System.out.println(student2.activity());
    }

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public String info() {
        return super.info() + " , Course: " + course;
    }
}
