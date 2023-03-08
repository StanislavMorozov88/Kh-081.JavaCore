package lesson6.hw1;


// Create two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class.
//        Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child).
//        Describe the string variable socialSecurityNumber in the class SalariedEmployee .
//        Include a description of federalTaxIdmember in the class of ContractEmployee.

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdmember;
    private int hours;
    private double rate;


    public ContractEmployee(String employeeld, String federalTaxIdmember, int hours, double rate) {
        super(employeeld);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hours = hours;
        this.rate = rate;
    }

    //  The calculation formula for the "time-worker“ is: the average monthly
    //       salary = hourly rate * number of hours worked
    @Override
    public double calculatePay() {
        return salary = hours * rate;
    }




}
