package lesson10.home;

import java.util.*;
import java.util.stream.Collectors;

public class Home02 {

    public static void printDuplicateFirstName(Map<String, String> personMap) {
        if (hasDuplicateValues(personMap)) {
            personMap.entrySet().stream()
                    .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.counting()))
                    .entrySet().stream()
                    .filter(entry -> entry.getValue() > 1)
                    .forEach(entry -> System.out.println(entry.getValue() + " person with the first name " + entry.getKey()));
        } else {
            System.out.println("No duplicate first name in a map.");
        }
    }

    private static boolean hasDuplicateValues(Map<String, String> personMap) {
        return personMap.values().stream().distinct().count() < personMap.size();
    }

    private static void removeByFirstName(Map<String, String> personMap, String firstName) {
        if (personMap.containsValue(firstName)) {
            personMap.values().removeIf(firstName::equals);
        } else {
            System.out.println("No person with such a first name.");
        }
    }

    public static void printMap(Map<String, String> personMap) {
        System.out.println("personMap: ");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.printf("Last name: %s, First name: %s%n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = Map.of(
                "DiCaprio", "Leonardo",
                "Brando", "Marlon",
                "Freeman", "Morgan",
                "Hopkins", "Anthony",
                "Oreira", "Natalia",
                "Headey", "Lena",
                "Clark", "Emilia",
                "Fairley", "Lena",
                "Turner", "Sophie",
                "Tena", "Natalia"
        );
        Map<String, String> personMap = new TreeMap<>(map);
        printMap(personMap);

        System.out.println("*****************************************************");
        printDuplicateFirstName(personMap);

        System.out.println("*****************************************************");
        removeByFirstName(personMap, "Natalia");
        printMap(personMap);


    }
}
