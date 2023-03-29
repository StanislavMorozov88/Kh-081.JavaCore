package PracticalTask._7.Task2;

public class Cleaner extends Staff{

    public final String TYPE_PERSON = "Cleaner"; //Я не поняв шо робити з цим

    public Cleaner(String name) {
        super(name);
        System.out.print(TYPE_PERSON.concat("; "));
    }

    @Override
    public void print() {
        System.out.println("I am a cleaner and my name is ".concat(getName()).concat("; "));
    }

    @Override
    public double salary() {
        return 7500;
    }
}