package PracticalTask._7.Task2;

public class Student extends Person{

    public final String TYPE_PERSON = "Student"; //Я не поняв шо робити з цим

    public Student(String name) {
        super(name);
        System.out.print(TYPE_PERSON.concat("; "));
    }

    @Override
    void print() {
        System.out.println("I am a student and my name is ".concat(getName()).concat("; "));
    }
}
