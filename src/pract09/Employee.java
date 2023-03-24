package pract09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(1, "Serhii");
        employeeMap.put(2, "Oksana");
        employeeMap.put(3, "Yurii");
        employeeMap.put(5, "Maria");
        employeeMap.put(6, "Maxym");

        System.out.println(employeeMap);
        System.out.println(employeeMap.keySet());
        System.out.println(employeeMap.values());

        System.out.println("Enter the ID number of employee: ");
        int id = Integer.parseInt(br.readLine());

        boolean isIdFound = false;
        for (Integer key : employeeMap.keySet()) {
            if (employeeMap.containsKey(id) && !isIdFound) {
                System.out.println("ID # " + id + " has employee with name " + employeeMap.get(id));

            } else {
                System.out.println("There is no employee with entered ID");
            }
            break;
        }

        System.out.println("Enter the employee name: ");
        String name = br.readLine();

        boolean isNameFound = false;

        for (String value : employeeMap.values()) {
            if (employeeMap.containsValue(name) && !isNameFound) {
                System.out.println("Employee with name " + name + " has ID # " + employeeMap.keySet()); // не виходить витягнути конкретний key для введеного name

            } else {
                System.out.println("There is no employee with entered name");
            }
            break;
        }

    }
}
