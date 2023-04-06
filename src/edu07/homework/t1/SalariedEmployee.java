package edu07.homework.t1;

public class SalariedEmployee extends Employee implements Payment {
    double hourlyRate;
    double hoursWorked;
    String socialSecurityNumber;

    SalariedEmployee(String employeeId, String name, double hourlyRate, double hoursWorked, String socialSecurityNumber) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}