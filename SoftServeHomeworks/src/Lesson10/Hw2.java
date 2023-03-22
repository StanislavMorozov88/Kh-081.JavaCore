package Lesson10;

import java.util.*;

public class Hw2 {
    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>();

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
        System.out.println(personMap);

        Hw2.lookForDuplicates(personMap);
    }

    public static void lookForDuplicates(Map<String, String> map) {
        HashMap<String, Integer> newMap = new HashMap<>();
        HashMap<String, String> deletedMap = new HashMap<>();
        int i = 1;
        for (String v : map.values()) {
            if (newMap.containsKey(v)) {
                newMap.put(v, ++i);
            } else {
                newMap.put(v, i);

            }
        }
        for (Map.Entry<String, Integer> entry : newMap.entrySet()) {
            int a = entry.getValue();
            if (entry.getValue() > 1) {
                while (a>1) {
                    removeItemFromMapByValue(map, entry.getKey());
                    a--;

                }
            }
        }
        System.out.println(newMap);
        System.out.println("Map without repetition: " + map);
    }


    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map); // нашел этот метод в интернете, зачем тут создавать эту копию(Без нее выдает эксепшин)?
        for (Map.Entry<String, String> entry : copy.entrySet()) {
            if (entry.getValue().equals(value)) {
                map.remove(entry.getKey());
                break;
            }
        }
    }

}



