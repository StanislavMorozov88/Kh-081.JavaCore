package pract03;

public class Products {
    private String name;
    private float price;
    private int quantity;

    public Products(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public boolean mostExpensive(Products p) {
        return this.price > p.price;
    }

    public boolean mostPopular(Products p) {
        return  this.quantity > p.quantity;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
