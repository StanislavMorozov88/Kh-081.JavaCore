package lesson9.taskInLesson;

import java.util.HashMap;
import java.util.Map;

/**
 * Створити HashMap
 *     Створіть HashMap, що містить пару значень - ім'я іграшки та об'єкт іграшки (клас Product).
 *     Перебрати та роздрукувати пару значень - entrySet().
 *     Перебрати та роздрукувати набір з імені продуктів - keySet().
 *     Перебрати і роздрукувати значення продуктів - values().
 *     Для кожного перебора створіть свій метод.
 */
public class Task {
    public static void main(String[] args) {
        Map<String, Product> toyMap = new HashMap<>();
        Product p1 = new Product("Bear", 12,4);
        Product p2 = new Product("Bird", 15,9);
        Product p3 = new Product("Bunny", 9,2);
        toyMap.put("Mick",p1);
        toyMap.put("Tom",p2);
        toyMap.put("Sara",p3);
        for (Map.Entry<String,Product> entry: toyMap.entrySet()) {
            System.out.println(entry.getKey());
        }
        for (Map.Entry<String,Product> entry: toyMap.entrySet()) {
            System.out.println(entry.getValue());
        }
        for (Map.Entry<String,Product> entry: toyMap.entrySet()) {
            System.out.println("Name: "+entry.getKey()+" Value: "+entry.getValue());
        }
    }
}
