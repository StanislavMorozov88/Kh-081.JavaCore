package edu04.practical;

public enum Product {
    Cap("Cap", 20, 50), tShirt("T-Shirt", 10, 25),
    Jeans("Jeans", 50, 20), Sneakers("Sneakers", 75, 10);

    private final String name;
    private final int price;
    private final int quantity;

    Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
