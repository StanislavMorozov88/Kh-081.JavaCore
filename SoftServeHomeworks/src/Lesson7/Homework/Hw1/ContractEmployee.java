package Lesson7.Homework.Hw1;

import java.util.Objects;

public class ContractEmployee extends Employee implements Payment {
    private int fixedPaid;
    private int federalTaxIdMember;
    private int salary = calculatePay();


    public int getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public ContractEmployee(String name, int employeeId, int fixedPaid, int federalTaxIdMember) {
        super(employeeId, name);
        this.fixedPaid = fixedPaid;
        this.federalTaxIdMember = federalTaxIdMember;
        salary = calculatePay();
    }
    public int calculatePay() {
        return fixedPaid;
    }


    public int getFixedPaid() {
        return fixedPaid;
    }

    @Override
    public int compare(Employee e1, Employee e2) {

        return e1.getSalary() - e2.getSalary();
    }


    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "Name: " + getName() +
                " fixedPaid=" + fixedPaid +
                ", federalTaxIdMember=" + federalTaxIdMember +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContractEmployee that = (ContractEmployee) o;
        return fixedPaid == that.fixedPaid && federalTaxIdMember == that.federalTaxIdMember;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fixedPaid, federalTaxIdMember);
    }
}
