package lesson07.home.employee;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private double hourlyRate;
    private int hoursWorked;

    public SalariedEmployee(String name, String socialSecurityNumber, double hourlyRate) {
        super(name);
        checkSocialSecurityNumber(socialSecurityNumber);
        checkHourlyRate(hourlyRate);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        hoursWorked = 40; //по замовчуванню 40, але є сетер.
    }

    @Override
    public double getSalary() {
        salary = calculatePay();
        return salary;
    }

    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours is negative");
        }
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        checkHourlyRate(hourlyRate);
        this.hourlyRate = hourlyRate;
    }

    public void checkHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Rate is negative.");
        }
        this.hourlyRate = hourlyRate;
    }

    public void checkSocialSecurityNumber(String socialSecurityNumber) {
        if (socialSecurityNumber == null || socialSecurityNumber.isBlank()) {
            throw new IllegalArgumentException("Social security number is null or empty");
        }
    }

    @Override
    public String toString() {
        return "Salaried" + super.toString();
    }
}
