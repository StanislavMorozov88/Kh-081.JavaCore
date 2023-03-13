package com.softserve.lesson7.homeTask.employee;

import java.util.Comparator;

public abstract class Employee implements Comparator<Employee>, Payment {
    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    String employeeId;


    public int compareTo(Employee o) {
        return Double.compare(this.calculatePay(), o.calculatePay());
    }
}
