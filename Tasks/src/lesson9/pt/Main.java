package lesson9.pt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * In the main() method declare map employeeMap of pairs <Integer, String>.
 * Add to employeeMap seven pairs (ID, name) of some persons.
 * Display the map on the screen.
 * Ask user to enter ID, then find and write corresponding name from your map.
 * If you can't find this ID - say about it to user (use function containsKey()).
 * Ask user to enter name, verify than you have name in your map and write corresponding ID.
 * If you can't find this name - say about it to user (use function containsValue()).
 */

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Mick");
        employeeMap.put(2, "John");
        employeeMap.put(3, "Alex");
        employeeMap.put(4, "Ann");
        employeeMap.put(5, "Nick");
        employeeMap.put(6, "Kate");
        employeeMap.put(7, "Sara");
        System.out.println(employeeMap);
        printMap(employeeMap);
        findUserById(employeeMap);
        findUserByName(employeeMap);
    }

    /**
     * Display the map on the screen
     */
    public static void printMap(Map<Integer,String> map){
        for (Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println("ID: "+entry.getKey()+"; Name: "+entry.getValue());
        }
    }

    /**
     * Ask user to enter ID, then find and write corresponding name from your map.
     * If you can't find this ID - say about it to user (use function containsKey()).
     */
    public static void findUserById(Map<Integer, String> map) {
        System.out.println("Please enter ID of person.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (map.containsKey(num)) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getKey().equals(num)){
                    System.out.println("Person name by ID: " + entry.getValue());
                }
            }
        } else {
            System.out.println("Don't have person with " + num + " ID");
        }
    }

    /**
     * Ask user to enter name, verify than you have name in your map and write corresponding ID.
     * If you can't find this name - say about it to user (use function containsValue()).
     */
    public static void findUserByName(Map<Integer, String> map) {
        System.out.println("Please enter name of person");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (map.containsValue(name)) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().equals(name)){
                    System.out.println("Person ID by name: " + entry.getKey());
                }
            }
        } else {
            System.out.println("Don't have person with name \"" + name + "\".");
        }
    }
}
