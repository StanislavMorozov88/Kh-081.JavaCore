package Homework._10;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(){
            @Override
            public String toString() {
                StringBuilder builder = new StringBuilder();
                builder.append("[");
                for (Map.Entry<String, String> entry : this.entrySet()) {
                    builder.append(entry.getValue())
                            .append(" ")
                            .append("\033[0;36m")
                            .append(entry.getKey())
                            .append("\033[0m")
                            .append(", ");
                }
                builder.setLength(builder.length() - 2);
                builder.append("]");
                return builder.toString();
            }
        };

        map.put("Wilson", "Peter");
        map.put("Anderson", "John");
        map.put("Smith", "David");
        map.put("Brown", "Sarah");
        map.put("Taylor", "Robert");
        map.put("Garcia", "Emily");
        map.put("Johnson", "Michael");
        map.put("Miller", "Jessica");
        map.put("Davis", "John");
        map.put("Jones", "Amanda");

        System.out.println(map);
        System.out.println(atLessTwoSameFirstName(map));
        removeByFirstName(map, "John");
        System.out.println(map);
    }

    public static void removeByFirstName(Map<String, String> map, String name){
        map.entrySet().removeIf(entry -> entry.getValue().equalsIgnoreCase(name));
    }

    public static boolean atLessTwoSameFirstName (Map<String, String> map){
        for (Map.Entry<String, String> entry : map.entrySet()) {
            byte count = 0;
            String name = entry.getValue();
            for (Map.Entry<String, String> innerEntry : map.entrySet()) {
                String temporalName = innerEntry.getValue();
                if (temporalName.equalsIgnoreCase(name)){
                    count++;
                }
                if (count >=2){
                    return true;
                }
            }
        }
        return false;
    }
}
/*
 * Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
 * Output the entities of the map on the screen.
 * There are at less two persons with the same firstName among these 10 people?
 * Remove from the map person whose firstName is ”Orest” (or other). Print result.
 */