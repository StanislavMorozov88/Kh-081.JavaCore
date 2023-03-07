package Lesson7.PracticalTasks;

public abstract class Staff extends Person {
    private int salary;
    public Staff(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.print("I am a ");

    }
    public abstract void salary();

    @Override
    public String toString() {
        return "Staff" +
                "salary=" + salary;
    }
}
