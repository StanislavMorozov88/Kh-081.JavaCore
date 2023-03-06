package edu05.practical;

public class Employee {
    private String name;
    private int depNumber;
    private int salary;

    public Employee(String name, int depNumber, int salary) {
        this.name = name;
        this.depNumber = depNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepNumber() {
        return depNumber;
    }

    public void setDepNumber(int depNumber) {
        this.depNumber = depNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", depNumber=" + depNumber +
                ", salary=" + salary +
                '}';
    }


}
