package lesson3.pt;

//  1. Enter three numbers. Find out how many of them are odd
//  2. Enter the number of the day of the week. Display the name in two languages
//  3. Enter the name of the country. Print the name of the continent
//     (Declare enum with names of continents)
//  4. Create class Product with fields name, price and quantity
//        • Create four instances of type Product
//        • Display the name and quantity of the most expensive item
//        • Display the name of the items, which has the biggest quantity

public class Product {
    //fields
    private String name;
    private float price;
    private int quantity;

    //constructors
    public Product() {
    }

    public Product(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void namePrice(){
        System.out.println("The most expensive item: \n"+ "Name: " + name
        + "\nPrice: "+ price );
    }

}
