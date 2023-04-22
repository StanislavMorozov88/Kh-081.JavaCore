package Lesson14.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee " +
                "name='" + name + '\'';
    }


    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Bob"),
                new Employee("Tom"),
                new Employee("Bob"),
                new Employee("Bob"),
                new Employee("Tom"),
                new Employee("Alex"),
                new Employee("Sam")
        ));


        Optional<String> emp = employees.stream()
                        .collect(Collectors.groupingBy(Employee::getName,Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey);

        System.out.println(emp);

    }
}
