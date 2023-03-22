package edu04.practice;

public class Product {
    private String name;
    private double price;
    private double quantity;

    public Product(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product " + "name is " + name + ", price is " + price + ", quantity=" + quantity;
    }

    public static void printMostExpensive(Product[] array) {
        Product mostExpensive = array[0];
        for (Product p : array) {
            if (p.price > mostExpensive.price) {
                mostExpensive = p;
            }
        }
        System.out.println("The most expensive product: " + mostExpensive.name);
    }

    public static void printBiggestQuantityProduct(Product[] array) {
        Product biggestQuantity = array[0];
        for (Product p : array) {
            if (p.quantity > biggestQuantity.quantity) {
                biggestQuantity = p;
            }
        }
        System.out.println("Product with the biggest quantity: " + biggestQuantity.name);
    }

}
class Main{
    public static void main(String[] args) {
    Product[] products = {
            new Product("pineapple", 25.5, 15),
            new Product("apple", 15.5, 80),
            new Product("tomato", 8.0, 40),
            new Product("orange", 18.0, 35),
    };

    Product.printBiggestQuantityProduct(products);
    Product.printMostExpensive(products);

    }
}
