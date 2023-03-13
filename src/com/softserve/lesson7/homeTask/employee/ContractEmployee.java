package com.softserve.lesson7.homeTask.employee;

public class ContractEmployee extends Employee implements Payment{

    private String federalTaxIdMember;
    private double fixedMonthlyPayment;

    public ContractEmployee(String employeeId, String federalTaxIdMember, double fixedMonthlyPayment) {
        super(employeeId);
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return  fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return employeeId + " " + federalTaxIdMember + " " + calculatePay();
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return 0;
    }
}
