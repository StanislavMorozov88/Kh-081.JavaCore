package Lesson4.PrTask;

public enum Product {
    COLA("Cola" ,500,12), SPRITE("Sprite", 620,15), FANTA("Fanta", 600, 8), PEPSI("Pepsi", 117, 56);
    private int quantity;
    private int price;
    private String name;

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    private Product(String name, int quantity, int price){
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }
}
