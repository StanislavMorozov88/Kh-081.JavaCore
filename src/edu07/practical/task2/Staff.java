package edu07.practical.task2;

public abstract class Staff extends Person{
    private double salary;

    public Staff(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public abstract void salary();

    @Override
    public void print() {
        System.out.println("I am a staff.");
    }
}
