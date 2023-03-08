package lesson07.home.employee;

import java.util.Arrays;

public class EmployeeService {
    private Employee[]employees;

    public EmployeeService(Employee[] employees) {
        this.employees = employees;
    }

    public void calculateSalary(){
        for (Employee employee:employees) {
            if (employee instanceof Payment){
                ((Payment) employee).calculatePay();
            }
        }
    }

    public void sortEmployeesSalaryDesc(){
        Arrays.sort(employees);
    }

    public void printEmployees(){
        for (Employee employee:employees) {
            System.out.println(employee);
        }
    }
}
