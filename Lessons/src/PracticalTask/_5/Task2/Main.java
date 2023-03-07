package PracticalTask._5.Task2;

public class Main {
    public static void main(String[] args) {
        Employee[] e = {
                new Employee("Ira", 1, 1),
                new Employee("Vera", 1, 3),
                new Employee("Lida", 1, 14),
                new Employee("Alice", 2, 0.5)
        };
        System.out.println(Employee.employersOfDepartment(1));

        Employee[] eSorted = Employee.getSortBySalary(e);
        for(Employee employee: eSorted){
            System.out.println(employee.toString());
        }

    }
}
