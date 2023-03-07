package Lesson7.PracticalTasks;

public class Student extends Person{
    private final String TYPE_PERSON;
    private int scholarship;
    public Student(String name, int scholarship) {
        super(name);
        this.scholarship = scholarship;
        TYPE_PERSON = "Student";
    }
    @Override
    public void print() {
        System.out.println("I am a " +TYPE_PERSON + " My name is " + getName());
    }
    public void salary(){
        System.out.println("I haven't got a salary, but my scholarship is " + scholarship);
        System.out.println();
    }
}
