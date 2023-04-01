package homework06;

import homework09.Student;

import java.util.Comparator;
import java.util.Objects;

public class ContractEmployee extends Employee implements Payment, Comparable<Employee> {

    private String federalTaxIdMember;
    private double fixedMonthlyPayment;

    public ContractEmployee(String employeeId) {
        super(employeeId);
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    public ContractEmployee(String employeeId, String federalTaxIdMember) {
        super(employeeId);
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public ContractEmployee(String employeeId, String federalTaxIdMember, double fixedMonthlyPayment) {
        super(employeeId);
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdMember='" + federalTaxIdMember + '\'' +
                ", fixedMonthlyPayment=" + fixedMonthlyPayment +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
