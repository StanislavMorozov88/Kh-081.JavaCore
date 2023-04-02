package edu06.homework.employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Joe Biden", 30, 50000.00);
        System.out.println(employee.report());

        Developer developer = new Developer("Donald Trump", 25, 60000.00, "Senior Developer");
        System.out.println(developer.report());
    }
}
