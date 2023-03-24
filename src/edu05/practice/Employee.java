package edu05.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Employee implements Comparable<Employee>{
    //Employee with fields name, department number, salary. Create five objects of class Employee
    private String name;
    private int depNum;
    private double salary;
    public Employee(String name, int depNum, double salary) {
        this.name = name;
        this.depNum = depNum;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getDepNum() {
        return depNum;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee's " + "name " + name + ", depNum " + depNum + ", salary " + salary + "\n";
    }

    @Override
    public int compareTo(Employee o) {
        return (int) (this.salary - o.salary);
    }
}
class Main{
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivan Petrenko", 1, 27000.50);
        employees[1] = new Employee("Sergiy Ivanenko", 3, 25500.25);
        employees[2] = new Employee("Petro Sergienko", 5, 19450.00);
        employees[3] = new Employee("Andriy Pasternak", 7, 32000.35);
        employees[4] = new Employee("Svitlana Ivanivna", 7, 28000.12);
        //Display all employees of a certain department (enter department number in the console)
        System.out.println("Enter the number of the department: ");
        Scanner sc = new Scanner(System.in);
        int wantedDep = sc.nextInt();
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getDepNum() == wantedDep) System.out.println("Employers from this department are: "
                    + employees[i].getName());
        }
        //Arrange workers by the field salary in descending order
        Arrays.sort(employees);
        System.out.println("After sorting " + Arrays.toString(employees));
    }
}
