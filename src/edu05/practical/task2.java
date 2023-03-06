package edu05.practical;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Tom", 1, 3000),
                new Employee("Alisa", 1, 2500),
                new Employee("Ivan", 2, 2000),
                new Employee("Maryna", 2, 1500),
                new Employee("Vasyl", 3, 1000)
        };

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the department number from 1 to 3: ");
        int depNumber = scan.nextInt();
        scan.close();

        System.out.println("Input the department number: " + depNumber);
        for (Employee employee: employees){
            if(employee.getDepNumber() == depNumber)
                System.out.println(employee);
        }

        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i+1; j < employees.length; j++) {
                if (employees[i].getSalary() < employees[j].getSalary()) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }

        System.out.println("Employees sorted by salary:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }



    }
}
