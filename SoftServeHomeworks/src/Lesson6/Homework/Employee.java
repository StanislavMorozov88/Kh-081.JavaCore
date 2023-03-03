package Lesson6.Homework;

public class Employee {
    private String name;
    private int salary;
    private int age;

    public Employee(String name, int salary, int age) {
       this.name = name;
        this.salary = salary;
       this.age = age;
    }

    public String report() {
        return String.format("Name: %s , Salary: %1d , Age: %2d", name, salary,age);

    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
