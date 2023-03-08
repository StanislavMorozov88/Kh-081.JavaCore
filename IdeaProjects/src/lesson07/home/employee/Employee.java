package lesson07.home.employee;

public class Employee implements Comparable<Employee> {
    private String name;
    private String employeeId;
    private static int employeeCount;
    protected double salary;

    public Employee(String name) {
        checkName(name);
        this.name = name;
        employeeCount++;
        employeeId = String.format("%010d", employeeCount);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void checkName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is null or empty");
        }
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(o.getSalary(), this.getSalary());
    }

    @Override
    public String toString() {
        return "Employee[" +
                "employeeId='" + employeeId +
                "', name='" + name +
                "', salary=" + getSalary() + "]";
    }
}
