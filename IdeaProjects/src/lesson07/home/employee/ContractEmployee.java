package lesson07.home.employee;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdMember;
    private double fixedMonthlyPayment;

    public ContractEmployee(String name, String federalTaxIdMember, double fixedMonthlyPayment) {
        super(name);
        checkFederalTaxIdMember(federalTaxIdMember);
        checkFixedMonthlyPayment(fixedMonthlyPayment);
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double getSalary() {
        salary = calculatePay();
        return salary;
    }

    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        checkFixedMonthlyPayment(fixedMonthlyPayment);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public void checkFixedMonthlyPayment(double fixedMonthlyPayment) {
        if (fixedMonthlyPayment < 0) {
            throw new IllegalArgumentException("Monthly payment is negative.");
        }
    }

    public void checkFederalTaxIdMember(String federalTaxIdMember) {
        if (federalTaxIdMember == null || federalTaxIdMember.isBlank()) {
            throw new IllegalArgumentException("FederalTaxIdMember is null or empty.");
        }
    }

    @Override
    public String toString() {
        return "Contract" + super.toString();
    }
}
