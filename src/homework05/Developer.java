package homework05;

public class Developer extends Employee {
    private String specialization;
    public Developer(String name, int age, String position, double salary) {

        super(name, age, position, salary);
        this.specialization = specialization;
    }

    @Override
    public String report() {

        return "Name: " + getName() + ", Age: " + getAge() + " years, Position: " + specialization + " " + getPosition() + ", Salary: " + getSalary();
    }

    @Override
    public String toString() {

        return "Developer{}";
    }
}

class DemoDeveloper {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Nataly", 34, "manager", 37654.7);
        employees[1] = new Employee("Zahar", 40, "manager", 5432.5);
        employees[2] = new Employee("Mark", 45, "developer", 65430.6);

        Developer[] developers = {new Developer("Yaroslav", 34, "BE developer", 50000.3),
        new Developer("Oleh", 28, "FE developer", 30500.6),
        new Developer("Olha", 38, "FE developer", 44000.6)};

        for (Employee employee : employees) {
            System.out.println(employee.report());
        }

        for (Developer developer : developers) {
            System.out.println(developer.report());
        }
    }
}