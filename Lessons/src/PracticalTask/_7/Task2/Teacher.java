package PracticalTask._7.Task2;

public class Teacher extends Staff{

    public final String TYPE_PERSON = "Teacher"; //Я не поняв шо робити з цим

    public Teacher(String name) {
        super(name);
        System.out.print(TYPE_PERSON.concat("; "));
    }

    @Override
    public void print() {
        System.out.println("I am a teacher and my name is ".concat(getName()).concat("; "));
    }

    @Override
    public double salary() {
        return 12000;
    }
}

