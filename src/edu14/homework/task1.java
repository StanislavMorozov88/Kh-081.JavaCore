package edu14.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task1 {
    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(
                new Product("TV", LocalDate.of(2020,1,5), 10000),
                new Product("TV", LocalDate.of(2021,2,10), 11000),
                new Product("TV", LocalDate.of(2022,1,15), 12000),
                new Product("TV", LocalDate.of(2022,2,20), 15000),
                new Product("TV", LocalDate.of(2023,2,15), 18000),

                new Product("Hoover", LocalDate.of(2020,1,5), 3000),
                new Product("Hoover", LocalDate.of(2021,2,10), 4000),
                new Product("Hoover", LocalDate.of(2022,3,15), 5500),
                new Product("Hoover", LocalDate.of(2022,4,20), 6000),
                new Product("Hoover", LocalDate.of(2023,3,15), 7500),

                new Product("Computer", LocalDate.of(2020,1,5), 15000),
                new Product("Computer", LocalDate.of(2021,2,10), 16000),
                new Product("Computer", LocalDate.of(2022,3,15), 17000),
                new Product("Computer", LocalDate.of(2022,4,20), 20000),
                new Product("Computer", LocalDate.of(2023,2,15), 23000),

                new Product("Phone", LocalDate.of(2020,1,5), 2500),
                new Product("Phone", LocalDate.of(2019,2,10), 2999),
                new Product("Phone", LocalDate.of(2023,3,15), 3500),
                new Product("Phone", LocalDate.of(2021,1,20), 4000),
                new Product("Phone", LocalDate.of(2022,1,15), 5000)
        );

        LocalDate dateYearAgo = LocalDate.now().minusDays(365);

        List<Product> phoneList = productList.stream()
                .filter(p -> p.getCategory() == "Phone" && p.getPrice() > 3000
                        && p.getDateOfManufacture().compareTo(dateYearAgo) <= 0)
                .collect(Collectors.toList());
        phoneList.forEach(System.out::println);

        System.out.println();
        myFilter(productList,"TV", 11000, dateYearAgo);

    }

    public static void myFilter(List<Product> list, String category, int price, LocalDate date){
            List<Product> filteredList = list.stream()
                .filter(p -> (p.getCategory() == category) && (p.getPrice() > price)
                        && (p.getDateOfManufacture().compareTo(date) <= 0))
                .collect(Collectors.toList());
        filteredList.forEach(System.out::println);
    }

}

class Product{
    private String category;
    private LocalDate dateOfManufacture;
    private int price;

    public Product(String category, LocalDate dateOfManufacture, int price) {
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }
}