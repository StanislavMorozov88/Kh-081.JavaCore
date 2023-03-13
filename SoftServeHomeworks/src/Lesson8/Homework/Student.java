package Lesson8.Homework;

public class Student extends Person implements Cloneable {
    private int course;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String info() {
        return "First name: " + Student.super.getFullName().getFirstName() + ", Last name: " + Student.super.getFullName().getLastName() + ", Age: " + Student.super.getAge() + ", Course: " + getCourse();
    }

    @Override
    public String activity() {
        return "I study at university";
    }
}
