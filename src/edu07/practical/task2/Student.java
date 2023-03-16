package edu07.practical.task2;

public final class Student extends Person{
   static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    public static final String getTypePerson(){
        return TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
}
