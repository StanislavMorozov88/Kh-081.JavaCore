package lesson10.practical;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMap {
    public static final Scanner SC = new Scanner(System.in);

    public static void printIdByName(Map<Integer, String> employeeMap) {
        int id = readID();
        if (employeeMap.containsKey(id)) {
            String name = employeeMap.get(id);
            System.out.printf("ID: %d, Name: %s%n", id, name);
        } else {
            System.out.println("No such ID in a map");
        }
    }

    public static void printNameById(Map<Integer, String> employeeMap) {
        String name = readName();
        if (!employeeMap.containsValue(name)) {
            System.out.println("No employee with such ID.");
        } else {
            employeeMap.entrySet()
                    .stream()
                    .filter(entry -> entry.getValue().equals(name))
                    .map(Map.Entry::getKey)
                    .forEach(id -> System.out.printf("Name: %s, ID: %d%n", name, id));
        }
    }

    private static int readID() {
        int id;
        do {
            System.out.println("Enter ID: ");
            while (!SC.hasNextInt()) {
                System.out.println("Not valid ID.");
                SC.next();
            }
            id = SC.nextInt();
        } while (id <= 0);
        return id;
    }

    private static String readName() {
        System.out.println("Enter Emplyee name: ");
        return SC.next();
    }

    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(
                1, "Alice",
                2, "Alice",
                3, "Karen",
                4, "Bill",
                5, "Eva",
                6, "Kevin",
                7, "Merry"
        );
        Map<Integer, String> employeeMap = new HashMap<>(map);
        System.out.println(employeeMap);
        printIdByName(employeeMap);
        printNameById(employeeMap);
    }
}
