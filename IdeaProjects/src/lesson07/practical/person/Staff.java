package lesson07.practical.person;

public abstract class Staff extends Person {
    private double salary;

    public Staff(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    protected abstract void salary();

    @Override
    protected void print() {
        System.out.print("I am a ");
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "salary=" + salary +
                "} " + super.toString();
    }
}
