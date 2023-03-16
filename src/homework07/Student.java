package homework07;

import homework07.Person.FullName;

public class Student extends FullName implements Cloneable{
    private int courseNumber;

    public Student(String firstName, String lastName, int age, String fullName, int courseNumber) {
        super(firstName, lastName, age, fullName);
        this.courseNumber = courseNumber;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public String info() {
        return super.info();
    }

    @Override
    public String activity() {
        return "I study at university ";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student copyOfStudent1 = (Student) super.clone();
        return copyOfStudent1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courseNumber=" + courseNumber +
                '}';
    }
}
