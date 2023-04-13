package edu14.homework;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class task2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Borys", 1));
        employeeList.add(new Employee("Borys", 2));
        employeeList.add(new Employee("Borys", 3));
        employeeList.add(new Employee("Borys", 4));

        employeeList.add(new Employee("Ivan", 5));
        employeeList.add(new Employee("Ivan", 6));
        employeeList.add(new Employee("Ivan", 7));

        employeeList.add(new Employee("Sam", 8));
        employeeList.add(new Employee("Sam", 9));

        employeeList.add(new Employee("Bob", 10));

        System.out.println("The most popular name: " + findMostPopularName(employeeList));

    }

    public static Optional<String> findMostPopularName(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet().stream()
                .max(comparingByValue())
                .map(Entry::getKey);
    }

}

class Employee{
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
