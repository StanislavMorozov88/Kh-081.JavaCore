package pract04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class MainEmployee {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Nick", 1, 12500);
        employees[1] = new Employee("Paul", 2, 15000.500F);
        employees[2] = new Employee("Mary", 2, 14000.300F);
        employees[3] = new Employee("Mark", 3, 25000.200F);
        employees[4] = new Employee("Helga", 2, 10000.750F);

        System.out.println(Arrays.toString(employees));
        Arrays.sort(employees, new Employee());
        System.out.println(Arrays.toString(employees));


        System.out.println("Enter the number of department ");
        int number = Integer.parseInt(br.readLine());
        boolean isAnyEmployeeExistsForEnteredDepartmentNumber = false;
        for (Employee employee : employees) {
            if (number == employee.getDepartmentNumber()) {
                System.out.println(employee);
                isAnyEmployeeExistsForEnteredDepartmentNumber = true;
            }
        }
        if (!isAnyEmployeeExistsForEnteredDepartmentNumber) {
            System.out.println("There is no employees, working in the department " + number);
        }
    }
}