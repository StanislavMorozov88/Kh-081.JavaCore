package lesson6.hw1;

// Create two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class.
//        Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child).
//        Describe the string variable socialSecurityNumber in the class SalariedEmployee .
//        Include a description of federalTaxIdmember in the class of ContractEmployee.

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeld, String socialSecurityNumber, double salary) {
        super(employeeld, salary);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //    For employees with a fixed payment the formula is: the average monthly
    //      salary = fixed monthly payment
    @Override
    public double calculatePay() {
        return salary;
    }

}
