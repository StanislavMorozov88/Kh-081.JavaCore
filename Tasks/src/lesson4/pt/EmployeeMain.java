package lesson4.pt;

//Create a class Employee with fields name, department number, salary. Create five objects of class Employee.
//      Display
//        all employees of a certain department (enter department number in the console);
//        arrange workers by the field salary in descending order.

import java.util.Objects;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Create five objects of class Employee.
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Mick", 1, 347.1f);
        employees[1] = new Employee("Tom", 1, 93.4f);
        employees[2] = new Employee("Martin", 3, 136.3f);
        employees[3] = new Employee("John", 9, 95.1f);
        employees[4] = new Employee("Leo", 3, 153.5f);


        System.out.println("All employees:");
        //print all employees
        printArr(employees);
        //arrange workers by the field salary in descending order.
        sortArray(employees);
        System.out.println("Sort: ");
        //print all employees
        printArr(employees);

        //all employees of a certain department (enter department number in the console);
        System.out.print("\nEnter department num: ");

        int department = sc.nextInt();

        System.out.println("All employees of the " + department + " department: ");
        staff(employees, department);

//        for (int i = 0; i < employees.length; i++) {
//            if (department == employees[i].getDepartNum()) {
//                //System.out.println(employees[i].toString());
//                System.out.println(employees[i].getName());
//            }
//        }
//
//
//        //arrange workers by the field salary in descending order.
//        Employee temp;
//        for (int i = 0; i < employees.length - 1; i++) {
//            for (int j = i + 1; j < employees.length; j++) {
//                if (employees[i].getSalary() < employees[j].getSalary()) {
//                    temp = employees[i];
//                    employees[i] = employees[j];
//                    employees[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < employees.length; i++) {
//            System.out.println(employees[i].toString());
//        }

    }

    public static void printArr(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }

    //arrange workers by the field salary in descending order.
    private static void sortArray(Employee[] employees) {
        Employee temp;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].getSalary() < employees[j].getSalary()) {
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
    }

    //all employees of a certain department (enter department number in the console);
    private static void staff(Employee[] employees, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (department == employees[i].getDepartNum()) {
                //System.out.println(employees[i].toString());
                System.out.println(employees[i].getName());
            }
        }
    }
}
