package homework05;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String report() {
        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f.", name, age,salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
class DemoEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Nataly", 34, 37654.7);
        employees[1] = new Employee("Zahar", 40, 5432.5);
        employees[2] = new Employee("Mark", 45, 65430.6);

        for (Employee employee : employees) {
            System.out.println(employee.report());
        }
    }
}