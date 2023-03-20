package lesson10.additionalTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Product {
    private String kindOfToys;

    public Product(String kndOfToys) {
        this.kindOfToys = kndOfToys;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(kindOfToys, product.kindOfToys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kindOfToys);
    }

    @Override
    public String toString() {
        return "Product{" +
                "kindOfToys='" + kindOfToys + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Map<String, Product> map = Map.of(
                "Teddy", new Product("Teddy bear"),
                "Lego Legacy", new Product("Constructor"),
                "Kitty", new Product("Plush cat"),
                "Pokemonchik", new Product("Pokemon")
        );
        Map<String, Product> productMap = new HashMap<>(map);
        printEntrySet(productMap);
        printKeySet(productMap);
        printValues(productMap);
    }

    public static void printValues(Map<String, Product> productMap) {
        productMap.values().forEach(v-> System.out.println(v));
    }

    public static void printKeySet(Map<String, Product> productMap) {
        productMap.keySet().forEach(s-> System.out.println("Name of toys: " + s));
    }

    public static void printEntrySet(Map<String, Product> productMap) {
        productMap.forEach((k, v) -> System.out.println("Toy Name: " + k + ", " + v));
    }
}
