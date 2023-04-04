package lesson14.home;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private ManufactureCategory category;
    private int dateOfManufacture;
    private double price;

    public Product(ManufactureCategory category, int dateOfManufacture, double price) {
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public boolean isManufacturedOverYearAgo() {
        return Year.of(this.dateOfManufacture).isBefore(Year.now());
    }

    public ManufactureCategory getCategory() {
        return category;
    }

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category=" + category +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }

    private enum ManufactureCategory {
        LAPTOP, NOTEBOOK, PHONE, TABLET
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product(ManufactureCategory.LAPTOP, 2020, 3500),
                new Product(ManufactureCategory.PHONE, 2023, 15000),
                new Product(ManufactureCategory.TABLET, 2022, 7300),
                new Product(ManufactureCategory.NOTEBOOK, 2021, 35899),
                new Product(ManufactureCategory.PHONE, 2021, 8500),
                new Product(ManufactureCategory.PHONE, 2022, 8499),
                new Product(ManufactureCategory.PHONE, 2022, 2500),
                new Product(ManufactureCategory.TABLET, 2010, 1000),
                new Product(ManufactureCategory.TABLET, 2021, 5000),
                new Product(ManufactureCategory.LAPTOP, 2005, 15000),
                new Product(ManufactureCategory.PHONE, 2015, 3002),
                new Product(ManufactureCategory.NOTEBOOK, 2000, 3001),
                new Product(ManufactureCategory.PHONE, 2023, 15000),
                new Product(ManufactureCategory.PHONE, 2000, 3001),
                new Product(ManufactureCategory.TABLET, 1995, 3002),
                new Product(ManufactureCategory.PHONE, 2015, 5000),
                new Product(ManufactureCategory.NOTEBOOK, 2010, 3300),
                new Product(ManufactureCategory.PHONE, 1995, 1500),
                new Product(ManufactureCategory.PHONE, 2015, 4998),
                new Product(ManufactureCategory.PHONE, 2015, 4999)
        ));

        List<Product> phoneProductList = products.stream()
                .filter(p -> p.category.equals(ManufactureCategory.PHONE) && p.price > 3000 && p.isManufacturedOverYearAgo())
                .sorted(Comparator.comparingDouble(p -> p.price))
                .collect(Collectors.toList());
        System.out.println("Price-sorted list of Products from the Phone category: ");
        phoneProductList.forEach(System.out::println);
    }
}


