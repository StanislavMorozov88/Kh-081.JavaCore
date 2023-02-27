package com.softserve.lesson4.practicalTask;

/**
 * This program displays the name and quantity
 * of the most expensive item
 * and displays the name of the items,
 * which has the biggest quantity
 */
public class Task4 {

    /**
     * This method runs program
     */
    public static void main(String[] args) {
        Product bananas = new Product("Bananas", 12, 300);
        Product apples = new Product("Apples", 6, 100);
        Product peaches = new Product("Peaches", 15, 200);
        Product beans = new Product("Beans", 4.5, 999);

        Product[] products = {bananas, apples, peaches, beans}; // Making array
        displayMostExpensive(products);
        displayBiggestQuantity(products);
    }

    /**
     * This method checks prices of products in the array
     *  and displays price and name of the most expensive
     *      product
     * @param arr is an array of products
     */
    private static void displayMostExpensive(Product[] arr) {
        Product max = arr[0];
        for (Product v : arr) {
            if (v.getPrice() > max.getPrice()) {
                max = v;
            }
        }
        System.out.println(max.getName() + " " + max.getPrice());
    }

    /**
     * This method checks quantity of products in the array
     *  and displays price and name of the product which
     *          has the biggest quantity
     * @param arr is an array of products
     */
    private static void displayBiggestQuantity(Product[] arr) {
        Product max = arr[0];
        for (Product v : arr) {
            if (v.getQuantity() > max.getQuantity()) {
                max = v;
            }
        }
        System.out.println(max.getName() + " " + max.getQuantity());
    }
}

/**
 * This class is just simple class to create objects
 */
class Product {

    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}