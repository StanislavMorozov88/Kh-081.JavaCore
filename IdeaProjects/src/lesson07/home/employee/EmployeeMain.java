package lesson07.home.employee;

import java.util.Arrays;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee[]employees = {
                new SalariedEmployee("Bob","123456",499),
                new ContractEmployee("Alice","789654",30000),
                new SalariedEmployee("John","456321",500),
                new ContractEmployee("Tetiana","125897",50000),
                new Employee("Bill")
        };

        EmployeeService employeeService = new EmployeeService(employees);
        employeeService.calculateSalary();
        employeeService.printEmployees();//before sorting
        employeeService.sortEmployeesSalaryDesc(); //sorting
        employeeService.printEmployees(); //after sorting






    }
}
