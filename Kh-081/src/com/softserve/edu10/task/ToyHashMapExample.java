package com.softserve.edu10.task;
/**Створіть HashMap, що містить пару значень - ім'я іграшки та об'єкт іграшки (клас Product).
 * Перебрати та роздрукувати пару значень - entrySet().
 * Перебрати та роздрукувати набір з імені продуктів - keySet().
 * Перебрати і роздрукувати значення продуктів - values().
 * Для кожного перебора створіть свій метод.
 */
import java.util.HashMap;
import java.util.Map;

public class ToyHashMapExample {
    public static void main(String[] args) {
        Map<String, Product> toyMap = new HashMap<>();

        // Додавання значень до HashMap
        toyMap.put("LEGO", new Product("LEGO Building Blocks", 19.99));
        toyMap.put("Barbie", new Product("Barbie Doll", 9.99));
        toyMap.put("Hot Wheels", new Product("Hot Wheels Car", 4.99));
        toyMap.put("Teddy Bear", new Product("Stuffed Teddy Bear", 12.99));

        // Виклик методів
        printEntries(toyMap);
        printKeys(toyMap);
        printValues(toyMap);
    }

    // Метод для роздрукування пар значень
    public static void printEntries(Map<String, Product> map) {
        for (Map.Entry<String, Product> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    // Метод для роздрукування ключів
    public static void printKeys(Map<String, Product> map) {
        for (String key : map.keySet()) {
            System.out.println("Key: " + key);
        }
    }

    // Метод для роздрукування значень
    public static void printValues(Map<String, Product> map) {
        for (Product product : map.values()) {
            System.out.println("Value: " + product);
        }
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}