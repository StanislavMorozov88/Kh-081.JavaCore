package PracticalTask._10.Task1;

import java.util.*;

public class Main {

    private static ArrayList<Integer> existID = new ArrayList<>();

    public static void main(String[] args) {

        Map<Integer, String> employeeMap = new HashMap<>() {
            @Override
            public String toString() {
                StringBuilder builder = new StringBuilder();
                builder.append("[");
                for (Map.Entry<Integer, String> entry : this.entrySet()) {
                    builder.append("\033[0;36m")
                            .append(entry.getKey())
                            .append("\033[0m")
                            .append(": ")
                            .append(entry.getValue())
                            .append(", ");
                }
                builder.setLength(builder.length() - 2);
                builder.append("]");
                return builder.toString();
            }
        };

        employeeMap.put(generateID(), "Peter");
        employeeMap.put(generateID(), "John");
        employeeMap.put(generateID(), "Mathew");
        employeeMap.put(generateID(), "Andrew");
        employeeMap.put(generateID(), "Andrew");
        employeeMap.put(generateID(), "Simon");
        employeeMap.put(generateID(), "Judah");

        System.out.println("Our Map of persons:\n" + employeeMap + "\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID to find person: ");
        int ID = sc.nextInt();

        while (true) {
            if (employeeMap.containsKey(ID)) {
                System.out.println("Name: \033[0;36m" + employeeMap.get(ID) + "\033[0m");
                break;
            } else {
                System.out.print("Try enter ID again: ");
                ID = sc.nextInt();
            }
        }

        System.out.print("Enter name to find related ID: ");
        String name = sc.next();

        while (true) {
            if (employeeMap.containsValue(name)) {
                for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                    if (entry.getValue().equals(name)) {
                        Integer key = entry.getKey();
                        System.out.println("ID: \033[0;36m" + key + "\033[0m");
                    }
                }
                break;
            } else {
                System.out.print("Try enter ID again: ");
                name = sc.next();
            }
        }

    }

    public static int generateID() {
        Random random = new Random(0);
        StringBuilder builder = new StringBuilder();
        int ID;
        builder.append(random.nextInt(1, 9))
                .append(random.nextInt(0, 9))
                .append(random.nextInt(0, 9))
                .append(random.nextInt(0, 9));
        ID = Integer.parseInt(builder.toString());
        while (true) {
            if (existID.contains(ID)) {
                builder.setLength(0);
                builder.append(random.nextInt(1, 9))
                        .append(random.nextInt(0, 9))
                        .append(random.nextInt(0, 9))
                        .append(random.nextInt(0, 9));
                ID = Integer.parseInt(builder.toString());
            } else {
                existID.add(ID);
                break;
            }
        }
        return ID;
    }
}

/*
  In the main() method declare map employeeMap of pairs <Integer, String>.
  -Add to employeeMap seven pairs (ID, name) of some persons.
   Display the map on the screen.
  -Ask user to enter ID, then find and write corresponding name from your map.
   If you can't find this ID - say about it to user (use function containsKey()).
  -Ask user to enter name, verify than you have name in your map and write corresponding ID.
   If you can't find this name - say about it to user (use function containsValue()).
*/