package Homework._7.Task1;

import java.util.Arrays;

public class Main {

    public static double roundDouble(double number, int digits) {
        return Math.round(number * Math.pow(10, digits)) / Math.pow(10, digits);
    }

    public static void main(String[] args) {

        //Сказали массив, а не список, ну то окей
        Employee[] employees = {
                new ContractEmployee("John", 11000),
                new SalariedEmployee("Vera", 120, 100),
                new ContractEmployee("Jakob", 10000),
                new SalariedEmployee("Elvira", 70, 100),
                new ContractEmployee("Dio", 8000),
                new SalariedEmployee("Jamal", 90, 100),
                new ContractEmployee("Yato", 12000)
        };
        Arrays.sort(employees);

        //Використовую прінтфффф щоб просто протабулювати в ідейці, бо з табом все окей, а тут 4 пробіла...
        System.out.printf("%-20s%-7s%-12s%-10s%n"," ", "ID:", "Employee:", "Salary:");
        String temp;
        double sum = 0;

        for (Employee employee : employees) {
            if (employee instanceof SalariedEmployee) {
                temp = ((SalariedEmployee) employee).getSocialSecurityNumber();
            } else {
                temp = ((ContractEmployee) employee).getFederalTaxIdMember();
            }

            System.out.printf("%-20s%-7s%-12s%-10s%n", employee.getClass().getSimpleName() + ":",
                                temp, employee.getEmployeeld(), ((Payment) employee).calculatePay());
            sum += ((Payment) employee).calculatePay();
        }

        System.out.println("\nAverage monthly wage: " + roundDouble(sum / employees.length, 2));

    }
}

    /*
        Create Payment interface with the method calculatePay(),
        the base class Employee with a string variable employeeld.
        Create two classes SalariedEmployee and ContractEmployee,
        which implement interface and are inherited from the base class.
            -Describe hourly paid workers in the relevant classes (one of the children),
             and fixed paid workers (second child).
            -Describe the string variable socialSecurityNumber in the class SalariedEmployee .
            -Include a description of federalTaxIdmember in the class of ContractEmployee.
            -The calculation formula for the "time-worker" is:
             the average monthly salary = hourly rate * number of hours worked
            -For employees with a fixed payment the formula is:
             the average monthly salary = fixed monthly payment
            -Create an array of employees and add the employees with different form of payment.
            -Arrange the entire sequence of workers descending the average monthly wage.
             Output the employee ID, name, and the average monthly wage for all elements of the list.

     */
