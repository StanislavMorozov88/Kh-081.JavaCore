package Lesson10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hw2 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Smith", "Alex");
        personMap.put("Ronaldo", "Cris");
        personMap.put("Messi", "Leo");
        personMap.put("Kante", "Ngolo");
        personMap.put("Monte", "Leo");
        personMap.put("Gotze", "Chris");
        personMap.put("Terry", "Leo");
        personMap.put("Giroud", "Olivie");
        personMap.put("Lukaku", "Alex");
        personMap.put("Lol", "Alex");
        personMap.put("Tod", "Alex");
        personMap.put("Havertz", "Kai");

        System.out.println("Original Map: " + personMap);

        Map<String, String> mapWithoutDuplicates = removeDuplicateValues(personMap);

        System.out.println("Map without repetition: " + mapWithoutDuplicates);
    }

    public static Map<String, String> removeDuplicateValues(Map<String, String> map) {
        Map<String, String> mapWithoutDuplicates = new HashMap<>();
        Set<String> uniqueValues = new HashSet<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!uniqueValues.contains(value)) {
                uniqueValues.add(value);
                mapWithoutDuplicates.put(key, value);
            }
        }

        return mapWithoutDuplicates;
    }
}
