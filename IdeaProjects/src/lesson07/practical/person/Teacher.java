package lesson07.practical.person;

public class Teacher extends Staff {

    private final String TYPE_PERSON;

    public Teacher(String name, double salary) {
        super(name, salary);
        this.TYPE_PERSON = "Teacher";
    }

    @Override
    protected void salary() {
        System.out.printf("%s %s salary is: %,.2f%n", TYPE_PERSON, getName(), getSalary());
    }

    @Override
    protected void print() {
        super.print();
        System.out.printf("%s %s%n",TYPE_PERSON,getName());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'' +
                "} " + super.toString();
    }
}
