package Lesson7.PracticalTasks;

public class Cleaner extends Staff{

    private final String TYPE_PERSON;

    public Cleaner(String name, int salary) {
        super(name,salary);
        this.TYPE_PERSON = "Cleaner";
    }
    @Override
    public void print() {
        System.out.print("I am a " + TYPE_PERSON + " My name is " + getName());
    }
    @Override
    public void salary() {
        System.out.println();
        System.out.println("My salary is " + getSalary());
        System.out.println();
    }
}
