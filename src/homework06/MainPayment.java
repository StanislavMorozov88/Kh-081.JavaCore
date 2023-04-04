package homework06;

import java.util.Arrays;

public class MainPayment {
    public static void main(String[] args) {
        Employee[]employees = new Employee[4];
        employees[0] = new SalariedEmployee("1","100",800.0, 12);
        employees[1] = new ContractEmployee("10","111",25000.0);
        employees[2] = new SalariedEmployee("2", "200", 770.0, 9);
        employees[3] = new ContractEmployee("20", "222", 27500.0);

        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, (x, y) -> {
            if (x.calculatePay() > y.calculatePay()) {
                return -1;
            }
            if (x.calculatePay() < y.calculatePay()) {
                return 1;
            }
            return 0;
        });

        printEmployees(employees);
    }

    private static void printEmployees(Employee[] employees) {
        for (Employee emp : employees) {
            if (emp instanceof Payment) {
                Payment payEmp = (Payment) emp;
                System.out.printf("Employee ID: %s, Name: %s, Average Monthly Wage: $%.2f%n", emp.getEmployeeId(), emp.getClass().getSimpleName(), payEmp.calculatePay());
            } else {
                System.out.printf("Employee ID: %s, Name: %s (Not a Payment Employee)%n", emp.getEmployeeId(), emp.getClass().getSimpleName());
            }
        }
    }
}
