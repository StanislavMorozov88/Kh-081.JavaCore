package lesson04.practical;

public class ProductMain {
    public static void main(String[] args) {
        Product[] products = {
                new Product("cherry", 5, 1),
                new Product("apple", 6.3, 6),
                new Product("pear", 6.30000001, 2),
                new Product("banana",6.30000002,5)
        };

        Product.printMostExpensive(products);
        Product.printBiggestQuantityProduct(products);
    }
}
