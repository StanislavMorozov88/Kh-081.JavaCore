package lesson6.hw1;

//the base class Employee with a string variable employeeld.
public class Employee implements Payment, Comparable<Employee>{
    private String employeeld;
    protected double salary;

    public Employee(String employeeld) {
        this.employeeld = employeeld;
    }

    public Employee(String employeeld, double salary) {
        this.employeeld = employeeld;
        this.salary = salary;
    }

    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld='" + employeeld + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return Double.compare(employee.salary, salary) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(salary);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }
}
