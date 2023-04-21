package edu10.practice;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Petro");
        employeeMap.put(2, "Ivan");
        employeeMap.put(3, "Volodymyr");
        employeeMap.put(4, "Viktor");
        employeeMap.put(5, "Yaroslav");
        employeeMap.put(6, "Andrii");
        employeeMap.put(7, "Roman");
        System.out.println("Employee Map: " + employeeMap);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ID to find the name: ");
        int id = scanner.nextInt();
        if (employeeMap.containsKey(id)) {
            System.out.println("Name: " + employeeMap.get(id));
        } else {
            System.out.println("ID not found.");
        }

        System.out.print("Enter a name to find the ID: ");
        String name = scanner.next();
        if (employeeMap.containsValue(name)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println("ID: " + entry.getKey());
                }
            }
        } else {
            System.out.println("Name not found.");
        }

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4));
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Union: " + union(set1, set2));
        System.out.println("Intersection: " + intersect(set1, set2));

        Map<String, String> personMap = new HashMap<>();
        personMap.put("Khmelnitskiy", "Bohdan");
        personMap.put("Zelenskiy", "Volodya");
        personMap.put("Poroshenko", "Petro");
        personMap.put("Yanukovich", "Viktor");
        personMap.put("Yushchenko", "Viktor");
        personMap.put("Leonid", "Kuchma");
        personMap.put("Kravchuk", "Leonid");
        personMap.put("Biden", "Joe");
        personMap.put("Trump", "Donald");
        personMap.put("Obama", "Michele");
        System.out.println("Person Map: " + personMap);

        boolean hasDuplicate = false;
        Set<String> firstNameSet = new HashSet<>();
        for (String firstName : personMap.values()) {
            if (firstNameSet.contains(firstName)) {
                hasDuplicate = true;
                break;
            } else {
                firstNameSet.add(firstName);
            }
        }
        if (hasDuplicate) {
            System.out.println("There are at least two persons with the same firstName.");
        } else {
            System.out.println("There are no two persons with the same firstName.");
        }

        personMap.values().removeIf(firstName -> firstName.equals("Bohdan"));
        System.out.println("Person Map after removing Bohdan: " + personMap);
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        return intersect;
    }
}

