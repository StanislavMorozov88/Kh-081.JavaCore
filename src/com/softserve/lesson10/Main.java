package com.softserve.lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Mike");
        employeeMap.put(2, "Nike");
        employeeMap.put(3, "Bike");
        employeeMap.put(4, "Wike");
        employeeMap.put(5, "Sike");
        employeeMap.put(6, "Xike");
        employeeMap.put(7, "Pike");
        System.out.println(employeeMap);

        System.out.print("Enter ID: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        System.out.println(employeeMap.getOrDefault(key, "There is no such ID"));

        System.out.println("Enter Name: ");
        String value = sc.nextLine();
        value = sc.nextLine();
        if(employeeMap.containsValue(value)){
            for(Map.Entry m : employeeMap.entrySet()){
                if(m.getValue().equals(value)) {
                    System.out.println(m.getKey());
                }
            }
        } else {
            System.out.println("There is no such name");
        }

    }

}