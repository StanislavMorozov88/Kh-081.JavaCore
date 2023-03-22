package pract10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Product {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("Barbie", "doll");
        hashMap.put("Robby", "robot");
        hashMap.put("Teddy", "bear");

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        Set<String> keys = hashMap.keySet();
            System.out.print("keys: ");
            System.out.println(hashMap.keySet());

        Collection<String> values = hashMap.values();
            System.out.print("values: ");
            System.out.println(hashMap.values());


    }
}
