package lesson14.home;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Optional<String> getMostPopularName(List<Employee> employeeList) {
        if (employeeList == null) return Optional.empty();
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>(List.of(
                new Employee("Sam"),
                new Employee("Bill"),
                new Employee("Sam"),
                new Employee("Bob"),
                new Employee("Suzan"),
                new Employee("Bob"),
                new Employee("Darek")
        ));

        List<Employee> emptyList = new ArrayList<>();

        Optional<String> mostPopularName = getMostPopularName(employeeList);
        mostPopularName.ifPresent(n -> System.out.println("Most popular name: " + mostPopularName.get()));

        Optional<String> emptyMostPopularName = getMostPopularName(emptyList);
        emptyMostPopularName.ifPresent(n -> System.out.println("Most popular name: " + emptyMostPopularName.get()));

        Optional<String> mostPopularForNull = getMostPopularName(null);
        mostPopularForNull.ifPresent(n -> System.out.println("Most popular name: " + mostPopularForNull.get()));
    }
}
