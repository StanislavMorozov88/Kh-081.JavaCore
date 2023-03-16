package edu07.homework.task1;

public class ContractEmployee extends Employee implements Payment{
    private String name;
    private double salary;

    public ContractEmployee(String employeeld, String name, double salary) {
        super(employeeld);
        this.name = name;
        this.salary = salary;
    }

    public double calculatePay(){
        return salary;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "ID='" + employeeld + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + calculatePay() +
                '}';
    }
}
