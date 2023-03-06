package lesson07.practical.person;

public class Student extends Person {
    private final String TYPE_PERSON;

    public Student(String name) {
        super(name);
        this.TYPE_PERSON = "Student";
    }

    @Override
    protected void print() {
        System.out.printf("I am a %s %s%n", TYPE_PERSON, getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'' +
                "} " + super.toString();
    }
}
