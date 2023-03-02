package com.softserve.lesson5.practicalTask;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {
    private String name;
    private int departmentNumber;
    private double salary;

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name;
    }



    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("David", 1, 1200);
        employees[1] = new Employee("Lisa", 2, 1300);
        employees[2] = new Employee("Bob", 2, 1300);
        employees[3] = new Employee("Dana", 1, 1200);
        employees[4] = new Employee("Dunkan", 3, 1400);

        displayAllDepartment(employees);
        arrangeBySalary(employees);
    }

    private static void displayAllDepartment(Employee[] arr){
        System.out.println("Input department number: ");
        Scanner sc = new Scanner(System.in);
        int departmentNumber = sc.nextInt();
        sc.close();
        for(Employee j : arr){
            if(j.departmentNumber == departmentNumber){
                System.out.println(j);
            }
        }
    }

    public static void arrangeBySalary(Employee[] arr) {
        Employee tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i].salary < arr[j].salary) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (Employee j : arr) {
            System.out.println(j.name + ": " + j.salary);
        }
    }

}
