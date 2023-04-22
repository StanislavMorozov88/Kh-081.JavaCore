package Lesson14.Homework;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String manufactureCategory;
    private int date;
    private int price;

    public Product(String manufactureCategory, int date, int price) {
        this.manufactureCategory = manufactureCategory;
        this.date = date;
        this.price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public int getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", date=" + date +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Product p1 = new Product("phone",2000,1234);
        Product p2 = new Product("phone",2010,32121);
        Product p3 = new Product("phone",2020,321);
        Product p4 = new Product("phone",2012,321321);
        Product p5 = new Product("bread",2023,43243);
        Product p6 = new Product("laptop",2010,213645);
        Product p7 = new Product("laptop",2020,12542);
        Product p8 = new Product("phone",2021,122);
        Product p9 = new Product("phone",2001,123);
        Product p10 = new Product("laptop",2012,1234);
        Product p11 = new Product("laptop",2015,2134);
        Product p12 = new Product("phone",2017,8675);
        Product p13 = new Product("computer",2016,342);
        Product p14 = new Product("computer",2022,12);
        Product p15 = new Product("phone",2023,6754);
        Product p16 = new Product("phone",2023,213);
        Product p17 = new Product("computer",2023,543);
        Product p18 = new Product("phone",2023,1234);
        Product p19 = new Product("computer",2001,321321);
        Product p20 = new Product("phone",2023,1234);
        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);
        products.add(p7);
        products.add(p8);
        products.add(p9);
        products.add(p10);
        products.add(p12);
        products.add(p11);
        products.add(p13);
        products.add(p14);
        products.add(p15);
        products.add(p16);
        products.add(p17);
        products.add(p18);
        products.add(p19);
        products.add(p20);

        products.stream()
                .filter(x -> x.getManufactureCategory().equals("phone"))
                .filter(x -> x.getDate()<2022)
                .sorted((x1,x2)-> x1.getPrice() - x2.getPrice())
                .forEach(System.out::println);
    }
}


