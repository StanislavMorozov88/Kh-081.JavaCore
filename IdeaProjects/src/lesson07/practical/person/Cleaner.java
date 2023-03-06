package lesson07.practical.person;

public class Cleaner extends Staff {
    private final String TYPE_PERSON;

    public Cleaner(String name, double salary) {
        super(name, salary);
        this.TYPE_PERSON = "Cleaner";
    }

    @Override
    protected void salary() {
        System.out.printf("%s %s salary is: %,.2f%n", TYPE_PERSON, getName(), getSalary());
    }

    @Override
    protected void print() {
        super.print();
        System.out.printf("%s %s%n", TYPE_PERSON, getName());
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'' +
                "} " + super.toString();
    }
}
