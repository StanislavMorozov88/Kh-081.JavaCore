package com.softserve.lesson7.homeTask.employee;

public class SalariedEmployee extends Employee implements Payment{
    private String socialSecurityNumber;
    private double hourlyRate;
    private int numberOfHoursWorked;

    public SalariedEmployee(String employeeId, String socialSecurityNumber) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public SalariedEmployee(String employeeId, String socialSecurityNumber, double hourlyRate, int numberOfHoursWorked) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return employeeId + " " + socialSecurityNumber + " " + calculatePay();
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return 0;
    }
}
