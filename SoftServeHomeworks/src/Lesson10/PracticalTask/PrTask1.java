package Lesson10.PracticalTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Bob");
        employeeMap.put(2, "Tod");
        employeeMap.put(3, "Alex");
        employeeMap.put(4, "Russel");
        employeeMap.put(5, "Marry");
        employeeMap.put(6, "Jane");
        employeeMap.put(7, "John");
        System.out.println(employeeMap);


        System.out.println("Please, enter the user ID");
        int scan = sc.nextInt();

        if (employeeMap.containsKey(scan)) {
            System.out.println(employeeMap.get(scan));
        } else {
            System.out.println("We can't find this user");
        }


        System.out.println("Enter the user name ");


        String name = sc.nextLine(); // ПОЧЕМУ НЕ ВІЗІВАЕТСЯ???? ПОКА НЕ ДОДЕЛАЛ, НЕ ПОНИМАЮ ЧЕГО НУЛЛ ВЫХОДИТ
        name = sc.nextLine();
        for (Map.Entry<Integer, String> entries : employeeMap.entrySet()) {
            if (entries.getValue().equals(name)) {
                System.out.println(entries.getKey()+" " +entries.getValue());
            }
        }
        if (!employeeMap.containsValue(name)) {
            System.out.println("We can't find this user");
        }
    }
}
