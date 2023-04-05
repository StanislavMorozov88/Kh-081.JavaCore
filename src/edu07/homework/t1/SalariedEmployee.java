package edu07.homework.t1;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private double salary;

    public SalariedEmployee(String employeeId, String socialSecurityNumber, double salary) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary / 12;
    }
}