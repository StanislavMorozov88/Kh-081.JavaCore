package pract06;

public class Student extends Person{

    public Student() {
        super();
    }
    @Override
    public String print() {
        System.out.println("I am a ");
        return "";
    }
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
    @Override
    public String toString() {
        return "Student{}";
    }
    public final void TypePerson() {}

}
class DemoStudent{
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student();
        students[1] = new Student();
    }
}