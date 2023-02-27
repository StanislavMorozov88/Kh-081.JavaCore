package com.softserve.edu03.practicalTask;

public class Employee {
    private String name;
    private double rate;
    private double hours;
    private static double totalSum;

    public Employee() {
    }
    //можна такий конструктор без параметрів, але значеннями за замовчуванням
//    public Employee() {
//        this.name = "";
//        this.rate = 0;
//        this.hours = 0;
//    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
       totalSum += getSalary();
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
     totalSum += getSalary();
    }

    public void setRate(double rate) {
     totalSum -= getSalary();
        this.rate = rate;
     totalSum += getSalary();
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
     totalSum -= getSalary();
        this.hours = hours;
     totalSum += getSalary();
    }

    public double getSalary() {
        return rate * hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    void changeRate(int rate) {
        setRate(rate);
        System.out.println("recalculate salary - " + getSalary());
    }


    void getBonuses() {
        double bonus = (0.1 * getSalary());
        totalSum += bonus;
        System.out.println("10% from salary - " + bonus);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
class Demo {
    public static void main(String[] args) {
        // Створюємо три об'єкти класу Employee
        Employee employee1 = new Employee("John", 10, 40);
        Employee employee2 = new Employee("Mary", 12, 35);
        Employee employee3 = new Employee("Bob", 15, 45);

        // Виводимо інформацію про співробітників
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        // Виводимо загальну заробітну плату всіх співробітників
        System.out.println("Total salary of all employees: " + Employee.getTotalSum());
    }
}
