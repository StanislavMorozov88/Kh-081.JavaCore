package lesson05.practical;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee {
    static final Scanner SC;

    static {
        SC = new Scanner(System.in);
    }

    private String name;
    private int department;
    private double salary;

    public Employee(String name, int department, double salary) {
        checkName(name);
        checkDepartment(department);
        checkSalary(salary);
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    private static void checkName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is null or empty");
        }
    }

    private static void checkDepartment(int department) {
        if (department < 0) {
            throw new IllegalArgumentException("department is negative");
        }
    }

    private static void checkSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("salary is negative");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Oleksandr", 1, 10.1),
                new Employee("Olena", 1, 15),
                new Employee("Katerina", 3, 8.5),
                new Employee("Stranger", 2, 13.2),
                new Employee("Tetiana", 2, 7.9)
        };

        sortEmployeesBySalaryDesc(employees);
        System.out.println(Arrays.toString(employees));
        Employee[] employeesByDepartment = getEmployeesByDepartment(employees);
        printEmployeesByDepartment(employeesByDepartment);

    }

    public static void sortEmployeesBySalaryDesc(Employee[] employees) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - i - 1; j++) {
                if (employees[j].salary < employees[j + 1].salary) {
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
    }

    public static Employee[] getEmployeesByDepartment(Employee[] employees) {
        int departmentNumber = readNumber();
        Employee[] employeeArr = new Employee[employees.length];
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].department == departmentNumber) {
                employeeArr[count++] = employees[i];
            }
        }
        return Arrays.copyOf(employeeArr, count);
    }

    public static void printEmployeesByDepartment(Employee[] employees) {
        if (employees.length == 0) {
            System.out.println("There are no employees in this department");
        } else System.out.println(Arrays.toString(employees));
    }

    private static int readNumber() {
        System.out.println("Enter department number");
        while (true) {
            try {
                return validateNumber(SC.nextInt());
            } catch (InputMismatchException e) {
                System.err.println("Not a number");
                SC.nextLine();
            } catch (IllegalArgumentException e) {
                System.err.println(" number not positive ");
                SC.nextLine();
            }
        }
    }

    private static int validateNumber(int number) throws IllegalArgumentException {
        if (number <= 0) throw new IllegalArgumentException();
        return number;
    }
}
