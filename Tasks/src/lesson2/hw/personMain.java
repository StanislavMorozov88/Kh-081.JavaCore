package lesson2.hw;

import lesson2.pt.Employee;

import java.util.Scanner;

public class personMain {
    public static void main(String[] args) {

        Employee employee = new Employee("John", 20, 3);
        System.out.println(employee);

        Employee employee3 = new Employee("Leo", 11.3f, 5);
        System.out.println(employee3);

        System.out.println("Total salary of all workers: " + Employee.totalSum());

        Employee employee1 = new Employee("Tom", 23);
        employee1.setHours(4);
        System.out.println(employee1);

        System.out.println("Total salary of all workers: " + Employee.totalSum());

        Employee employee2 = new Employee();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        employee2.setName(sc.nextLine());
        System.out.print("Enter employee rate: ");
        employee2.setRate(sc.nextFloat());
        System.out.print("Enter employee hours: ");
        employee2.setHours(sc.nextInt());
        System.out.println(employee2);
        System.out.println("Total salary of all workers: " + Employee.totalSum());
    }
}
