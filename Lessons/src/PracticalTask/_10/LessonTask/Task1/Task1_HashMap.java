package PracticalTask._10.LessonTask.Task1;

import java.util.HashMap;
import java.util.Map;

class Product implements Comparable<Product> {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product \"" + name + "\"";
    }


    @Override
    public int compareTo(Product product) {
        return this.name.compareTo(product.name);
    }
}

public class Task1_HashMap {

    public static void printCouples(Map<String, Product> map){
        System.out.println("Couples of keys and values: ");
        for (Map.Entry<String, Product> entry : map.entrySet() ){
            System.out.println("\t" + entry.getKey() + ": \t" + entry.getValue());
        }
    }

    public static void printKeys(Map<String, Product> map){
        System.out.print("Keys: ");
        StringBuilder builder = new StringBuilder();

        for (Map.Entry<String, Product> entry : map.entrySet() ){
            builder.append(entry.getKey()).append(", ");
        }
        builder.delete(builder.length()-2, builder.length());
        builder.append(".");
        System.out.println(builder.toString());
    }

    public static void printValues(Map<String, Product> map){
        System.out.print("Values: ");
        StringBuilder builder = new StringBuilder();

        for (Map.Entry<String, Product> entry : map.entrySet() ){
            builder.append("[").append(entry.getValue()).append("], ");
        }
        builder.delete(builder.length()-2, builder.length());
        System.out.println(builder.toString());
    }


    public static void main(String[] args) {

        Map<String, Product> map = new HashMap<>();
        map.put("Plane", new Product("Plane"));
        map.put("Car", new Product("Car"));
        map.put("Lego", new Product("Lego"));

        printCouples(map);
        printKeys(map);
        printValues(map);
    }
}
/*
    Створити HashMap
    Створіть HashMap, що містить пару значень - ім'я іграшки та об'єкт іграшки (клас Product).
        Перебрати та роздрукувати пару значень - entrySet().
        Перебрати та роздрукувати набір з імені продуктів - keySet().
        Перебрати і роздрукувати значення продуктів - values().
        Для кожного перебора сІтворіть свій метод.
*/