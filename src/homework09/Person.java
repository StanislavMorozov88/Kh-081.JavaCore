package homework09;

import java.util.HashMap;
import java.util.Map;

public class Person {
    public static void main(String[] args) {

        Map<String, String > personMap = new HashMap<>();

        personMap.put("Nick", "Brown");
        personMap.put("Olha", "Green");
        personMap.put("Oxy", "Grey");
        personMap.put("Nick", "White");
        personMap.put("Max", "Black");
        personMap.put("Orest", "Liutyi");
        personMap.put("Eliza", "Purple");
        personMap.put("Peter", "Yellow");
        personMap.put("Jack", "Black");
        personMap.put("Sam", "Red");

        System.out.println(personMap);

        personMap.remove("Orest");
        System.out.println(personMap);

    }
}
