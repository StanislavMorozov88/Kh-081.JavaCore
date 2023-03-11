package Lesson7.Homework.Hw1;

import java.util.Arrays;


public class Hw1 {
    public static void main(String[] args) {
        Employee[] employees = {new ContractEmployee("Oleh", 107, 15000, 32132),
                new SalariedEmployee("Dima", 101, 500, 50, 543534),
                new ContractEmployee("Alice", 109, 7000, 5433),
                new SalariedEmployee("Budy", 102, 700, 30, 32121),
                new ContractEmployee("Alex", 107, 1000, 86743),
                new SalariedEmployee("Bond", 101, 500, 50, 654564),
                new ContractEmployee("Ann", 109, 7000, 65434),
                new SalariedEmployee("Xxx", 102, 700, 30, 23131)
        };


        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getSalary() + "  " + employees[i].getName());
        }

        Arrays.sort(employees, new Employee());
        System.out.println(Arrays.toString(employees));

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof SalariedEmployee) {
                System.out.println(((SalariedEmployee) employees[i]).getSocialSecurityNumber() + "  " + employees[i].getSalary() + "  " + employees[i].getName());
            } else if(employees[i] instanceof ContractEmployee) {
                System.out.println(((ContractEmployee) employees[i]).getFederalTaxIdMember() + "  " + employees[i].getSalary() + "  " + employees[i].getName());
            }


            }
        }
    }


