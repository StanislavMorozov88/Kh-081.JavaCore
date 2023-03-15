package Lesson7.Homework.Hw1;

import java.util.Comparator;

public class Employee implements Payment, Comparator<Employee> {
    private int employeeId;
    private String name;
    private int salary;

    public Employee() {

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }


    @Override
    public int calculatePay() {
        return 0;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                '}';
    }
//  By age
//    @Override
//    public int compare(Employee e1, Employee e2) {
//        return e1.getSalary() - e2.getSalary();
//    }

    // just for me
    @Override
    public int compare(Employee e1, Employee e2) {
        int byName = e1.getName().compareTo(e2.getName());
        if (e1.getSalary() - e2.getSalary() == 0) {
            return byName;
        }
        return e1.getSalary() - e2.getSalary();
    }
}


