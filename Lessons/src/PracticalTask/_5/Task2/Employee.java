package PracticalTask._5.Task2;

import java.util.Arrays;
import java.util.Objects;

public class Employee {
    private String name;
    private int departmentNumber;
    private double salary;
    private static Employee[] employers = new Employee[0];

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        addEmployee(this);
    }

    private static void addEmployee(Employee employee){
        if(employers == null){
            employers = new Employee[1];
            employers[0] = employee;
        }else {
            employers = Arrays.copyOf(employers, employers.length + 1);
            employers[employers.length - 1] = employee;
        }
    }

    public static String employersOfDepartment(int departmentNumber){
        StringBuilder builder = new StringBuilder();
        for(Employee e: employers){
            if (e.departmentNumber == departmentNumber) {
                builder.append(e.name + "\n");
            }
        }
        return builder.toString();
    }

    public static Employee[] getSortBySalary(Employee[] e){
        Employee tmp;
        for (int i = 0; i < e.length - 1; i++) {
            for (int j = i + 1; j < e.length; j++) {
                if (e[i].salary < e[j].getSalary()) {
                    tmp = e[i];
                    e[i] = e[j];
                    e[j] = tmp;
                }
            }
        }
        return e;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departmentNumber == employee.departmentNumber && Double.compare(employee.salary, salary) == 0 && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, departmentNumber, salary);
    }

    //всяка чіпуха
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
