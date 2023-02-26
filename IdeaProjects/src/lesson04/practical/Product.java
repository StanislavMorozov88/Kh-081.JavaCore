package lesson04.practical;


public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        checkName(name);
        checkPrice(price);
        checkQuantity(quantity);
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static void printMostExpensive(Product[] array) {
        Product mostExpensive = array[0];
        for (Product p : array) {
            if (p.price > mostExpensive.price) {
                mostExpensive = p;
            }
        }
        System.out.println("Product name: " + mostExpensive.name + ", quantity: " + mostExpensive.quantity);
    }

    public static void printBiggestQuantityProduct(Product[] array) {
        Product biggestQuantity = array[0];
        for (Product p : array) {
            if (p.quantity > biggestQuantity.quantity) {
                biggestQuantity = p;
            }
        }
        System.out.println("Product name: " + biggestQuantity.name);
    }

    private static void checkQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity can't be negative");
        }
    }

    private static void checkName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is null or empty");
        }
    }

    private static void checkPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price is negative");
        }
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
