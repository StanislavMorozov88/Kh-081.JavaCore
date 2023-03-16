package edu07.homework.task1;

public class SalariedEmployee extends Employee implements Payment{
    private String name;
    private double numberOfHoursWorked;
    private double hourlyRate;
    private double salary;

    public SalariedEmployee(String employeeld, String name, double numberOfHoursWorked, double hourlyRate) {
        super(employeeld);
        this.name = name;
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculatePay(){
        return salary = hourlyRate * numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "ID='" + employeeld + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + calculatePay() +
                '}';
    }
}
