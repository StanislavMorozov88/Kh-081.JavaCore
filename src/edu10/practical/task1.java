package edu10.practical;
import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Objects;

public class task1 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1,"Alisa");
        employeeMap.put(2,"Boris");
        employeeMap.put(3,"Diana");
        employeeMap.put(4,"Alex");
        employeeMap.put(5,"Maksym");
        employeeMap.put(6,"Ivan");
        employeeMap.put(7,"Taras");

        for(Map.Entry<Integer, String> entry : employeeMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("----------------");
        System.out.println("Input id from 1 to 7:");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        if(input >= 1 & input <=7){
            System.out.println("Name = " + employeeMap.get(input));
        } else {
            System.out.println("Input is " + employeeMap.containsKey(input));
        }

        System.out.println("----------------");
        System.out.println("Input name");
        scan.nextLine();
        String name = scan.nextLine();
        scan.close();

        if(employeeMap.containsValue(name)){
            System.out.println("Collection has this name.");
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (Objects.equals(name, entry.getValue())) {
                    System.out.println(name + " has key = " + entry.getKey());
                }
            }
         } else {
            System.out.println("Collection hasn't this name.");
        }

    }
 }

