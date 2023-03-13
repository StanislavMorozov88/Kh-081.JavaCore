package com.softserve.lesson7.homeTask.employee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new ContractEmployee("22", "45", 2222);
        employees[1] = new SalariedEmployee("23", "12", 34, 40);
        employees[2] = new ContractEmployee("32", "55", 3333);
        employees[3] = new SalariedEmployee("33", "22", 44, 30);

        for (int i = 0; i < employees.length; i++){
            Employee tmp = null;
            for (int j = i + 1; j < employees.length; j++){
                if (employees[j].calculatePay() > employees[i].calculatePay()){
                    tmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmp;
                }
            }
        }

        for (Employee j : employees) {
            System.out.println(j);
        }
    }


}
