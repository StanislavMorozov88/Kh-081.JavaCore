package PracticalTask._5.Task2;

import Experiments.ConsoleMenuWrap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Employee[] e = {
                new Employee("Ira", 1, 1),
                new Employee("Vera", 1, 3),
                new Employee("Lida", 2, 14),
                new Employee("Alice", 1, 0.5),
                new Employee("Edvard", 2, 10),
                new Employee("Steve", 3, 7),
                new Employee("Candace", 2, 9.4)
        };
        Employee[] eSorted = Employee.getSortBySalary(e);

        ConsoleMenuWrap page = new ConsoleMenuWrap();
        page.addLine("Hello, please enter department index: ");
        page.show();
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        sc.close();
        page.clear();

        page.addLine("Employee in department №" + index + ":");
        page.addLine(Employee.employersOfDepartment(index));
        page.show();
        page.clear();

        SECONDS.sleep(1);
        page.addLine("Employers arranged by salary: ");
        for(Employee employee: eSorted){
            page.addLine(employee.toString());
        }
        page.show();

    }
}
