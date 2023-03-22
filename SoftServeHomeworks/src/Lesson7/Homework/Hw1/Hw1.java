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



        for (Employee employee : employees) {
            System.out.println(employee.getSalary() + "  " + employee.getName());
        }

        Arrays.sort(employees, new Employee());
        System.out.println(Arrays.toString(employees));


            for (Employee employee : employees) {
                if (employee instanceof SalariedEmployee) {
                    System.out.println(((SalariedEmployee) employee).getSocialSecurityNumber() +
                            "  " + employee.getSalary() + "  " + employee.getName());
                } else if (employee instanceof ContractEmployee) {
                    System.out.println(((ContractEmployee) employee).getFederalTaxIdMember() +
                            "  " + employee.getSalary() + "  " + employee.getName());
                }

            }
        }
    }


