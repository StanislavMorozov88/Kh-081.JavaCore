package budget_manager_hyperskill;

import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class Purchase {
    private final String name;
    private final double price;

    public Purchase(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static class PurchaseReader {
        public static final Scanner SC = new Scanner(System.in);

        public static Purchase getPurchaseFromConsole() {
            System.out.println("\nEnter purchase name:");
            String purchaseName = SC.nextLine();
            System.out.println("Enter its price:");
            double price = readDouble();
            SC.nextLine();
            return new Purchase(purchaseName, price);
        }

        public static double readDouble() {
            double a;
            while (!SC.hasNextDouble() || ((a = SC.nextDouble()) < 0)) {
                System.out.println("Enter positive value");
                SC.nextLine();
            }
            return a;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return Double.compare(purchase.price, price) == 0 && Objects.equals(name, purchase.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public int compareByPriceDesc(Purchase other) {
        return Double.compare(other.getPrice(), this.price);
    }

    @Override
    public String toString() {
        return String.join(" $", name, String.valueOf(new DecimalFormat("0.00").format(price)));
    }
}
