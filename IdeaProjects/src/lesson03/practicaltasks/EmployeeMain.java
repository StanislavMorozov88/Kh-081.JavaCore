package lesson03.practicaltasks;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Oleksandr");
        employee1.setRate(10);
        employee1.setHours(5);
        Employee employee2 = new Employee("Kate",25,3);
        Employee employee3 = new Employee("Olena");
        employee3.setRate(30);
        employee3.setHours(2);
        System.out.println(employee1 + "\n" + employee2 + "\n"+employee3);
        Employee.printTotalSalary();

        System.out.println();

        employee3.setHours(1);
        employee1.setRate(20);
        employee2.setRate(10);
        System.out.println(employee1 + "\n" + employee2 + "\n"+employee3);
        Employee.printTotalSalary();

    }
}
