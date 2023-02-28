package Lesson5.PracticalTask;

import java.util.Arrays;
import java.util.Scanner;

public class PrTask2 {


    public static void main(String[] args) {
        Employee e1 = new Employee("Bob", 123, 5000);
        Employee e2 = new Employee("Sam", 124, 7500);
        Employee e3 = new Employee("Tod", 123, 5780);
        Employee e4 = new Employee("Bot", 124, 8200);
        Employee e5 = new Employee("Marry", 127, 6850);
        Scanner scan = new Scanner(System.in);

//        System.out.println(e1);
//        System.out.println(e2);
//        System.out.println(e3);
//        System.out.println(e4);
//        System.out.println(e5);
        Employee[] employees = new Employee[5];
        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;
        employees[3] = e4;
        employees[4] = e5;
        int[] employeesSalary = {e1.getSalary(), e2.getSalary(), e3.getSalary(), e4.getSalary(), e5.getSalary()};


        System.out.println("Enter the number of employee department: ");
        int sc = scan.nextInt();
        for (int i = 0; i < employees.length ; i++) {
            if(employees[i].getDepartmentNumber() == sc){
                System.out.println(employees[i]);
            }else{
                System.out.println("There are not employees in this department");
                break;
            }
        }
        for (int i = 0; i < employeesSalary.length -1 ; i++) {
            for (int j = i+1 ; j < employeesSalary.length ; j++) {
                if(employeesSalary[i] < employeesSalary[j]){
                    int temp = employeesSalary[i];
                    employeesSalary[i] = employeesSalary[j];
                    employeesSalary[j] = temp;
                }
            }
        }
        System.out.println("Employees salary in descending order: " + Arrays.toString(employeesSalary));








    }




}
