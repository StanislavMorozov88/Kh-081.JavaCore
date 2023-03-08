package pract04;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparator<Employee> {
    private String name;
    private int DepartmentNumber;
    private float Salary;

    public Employee(String name, int departmentNumber, float salary) {
        this.name = name;
        DepartmentNumber = departmentNumber;
        Salary = salary;
    }

    public Employee() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return DepartmentNumber == employee.DepartmentNumber && Float.compare(employee.Salary, Salary) == 0 && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, DepartmentNumber, Salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", DepartmentNumber=" + DepartmentNumber +
                ", Salary=" + Salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return DepartmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        DepartmentNumber = departmentNumber;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o2.getSalary()-o1.getSalary());
    }
        public int compareTo(Object employee) { // Default Sort
        return name.compareTo(String.valueOf(((Employee) employee).getSalary()));

    }

}
