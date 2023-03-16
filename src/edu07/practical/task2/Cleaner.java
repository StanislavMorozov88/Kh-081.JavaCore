package edu07.practical.task2;

public final class Cleaner extends Staff{
    static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name, double salary) {
        super(name, salary);
    }

    public static final String getTypePerson(){
        return TYPE_PERSON;
    }

    @Override
    public void salary() {
        System.out.println(getName() + " " + TYPE_PERSON+ " " + getSalary());
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
}
