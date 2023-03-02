package pract04;

public class Employee {
    private String name;
    private int DepartmentNumber;
    private float Salary;

    public Employee(String name, int departmentNumber, float salary) {
        this.name = name;
        DepartmentNumber = departmentNumber;
        Salary = salary;
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
}
