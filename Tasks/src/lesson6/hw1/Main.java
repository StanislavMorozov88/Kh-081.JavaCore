package lesson6.hw1;


//  Create an array of employees and add the employees with different form of payment.
//  Arrange the entire sequence of workers descending the average monthly wage.
//      Output the employee ID, name, and the average monthly wage for all elements of the list.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new ContractEmployee("32", "1234", 180, 11),
                new SalariedEmployee("12", "321", 1200),
                new SalariedEmployee("24", "456", 980),
                new ContractEmployee("18", "678", 220, 8)
        };
        System.out.println("All employees: ");
        calcArrSalary(employees);
        inputArr(employees);

        Arrays.sort(employees);

        System.out.println("Sorted by salary: ");
        inputArr(employees);
    }
    private static void inputArr(Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    private static void calcArrSalary(Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
            employees[i].calculatePay();
        }
    }
}
