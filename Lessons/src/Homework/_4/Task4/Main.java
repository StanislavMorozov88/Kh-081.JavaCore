package Homework._4.Task4;

public class Main {
    public static void main(String[] args) {
        Product p[] = new Product[4];
        p[0] = new Product("снікерс", 57.3, 12);
        p[1] = new Product("марс", 63.2, 24);
        p[2] = new Product("баунті", 72.5, 13);
        p[3] = new Product("твікс", 79.15, 20);

        double maxPrice=0;
        int maxQuantity=0;
        String mostExpensiveProduct = null;

        for (Product product : p) {
            if (maxPrice < product.getPrice()) {
                maxPrice = product.getPrice();
                mostExpensiveProduct = product.getName();
            }
        }
        System.out.println("Найбільша ціна у батончику "+ mostExpensiveProduct+ " - "+ maxPrice+ " грн.");

        for (Product product : p) {
            if (maxQuantity < product.getQuantity()) {
                maxQuantity = product.getQuantity();
                mostExpensiveProduct = product.getName();
            }
        }
        System.out.println("Найбільша кількість товару у батончику "+ mostExpensiveProduct+ " - "+ maxQuantity+ " шт.");

    }
}
