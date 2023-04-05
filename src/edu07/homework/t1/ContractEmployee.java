package edu07.homework.t1;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdMember;
    private double hourlyRate;
    private double hoursWorked;

    public ContractEmployee(String employeeId, String federalTaxIdMember, double hourlyRate, double hoursWorked) {
        super(employeeId);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}