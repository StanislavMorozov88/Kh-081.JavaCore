package edu07.homework.t1;

public class ContractEmployee extends Employee implements Payment {
    double fixedMonthlyPayment;
    String federalTaxId;

    ContractEmployee(String employeeId, String name, double fixedMonthlyPayment, String federalTaxId) {
        super(employeeId, name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.federalTaxId = federalTaxId;
    }

    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}