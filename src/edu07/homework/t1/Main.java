package edu07.homework.t1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee("001", "John", 10.0, 160.0, "123-45-6789");
        employees[1] = new SalariedEmployee("002", "Jane", 12.0, 180.0, "987-65-4321");
        employees[2] = new ContractEmployee("003", "Bob", 4000.0, "X123456");
        employees[3] = new ContractEmployee("004", "Alice", 5000.0, "Y654321");

        Arrays.sort(employees, (e1, e2) -> Double.compare(((Payment) e2).calculatePay(), ((Payment) e1).calculatePay()));

        for(Employee e : employees) {
            System.out.println("Employee ID: " + e.employeeId + ", Name: " + e.name + ", Average Monthly Wage: " + ((Payment) e).calculatePay());
        }
    }
}