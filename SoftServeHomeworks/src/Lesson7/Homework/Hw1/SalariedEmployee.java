package Lesson7.Homework.Hw1;


import java.util.Objects;

public class SalariedEmployee extends Employee implements Payment {
    private int hourlyPaid;
    private int socialSecurityNumber;
    private int numbersOfWorkingHours;
    private int salary = calculatePay();

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public SalariedEmployee(String name, int employeeId, int hourlyPaid, int numbersOfWorkingHours, int socialSecurityNumber) {
        super(employeeId,name);
        this.numbersOfWorkingHours = numbersOfWorkingHours;
        this.hourlyPaid = hourlyPaid;
        this.socialSecurityNumber = socialSecurityNumber;
        salary = calculatePay();
    }

    public int calculatePay(){
      return  hourlyPaid*numbersOfWorkingHours;
    }



    public int getSalary() {
        return salary;
    }

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getSalary() - e2.getSalary();
    }







    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "Name: " + getName() +
                " hourlyPaid=" + hourlyPaid +
                ", socialSecurityNumber=" + socialSecurityNumber +
                ", numbersOfWorkingHours=" + numbersOfWorkingHours +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalariedEmployee that = (SalariedEmployee) o;
        return hourlyPaid == that.hourlyPaid && socialSecurityNumber == that.socialSecurityNumber && numbersOfWorkingHours == that.numbersOfWorkingHours;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hourlyPaid, socialSecurityNumber, numbersOfWorkingHours);
    }
}
