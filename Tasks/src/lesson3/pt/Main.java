package lesson3.pt;

import java.util.Scanner;

//  1. Enter three numbers. Find out how many of them are odd
//  2. Enter the number of the day of the week. Display the name in two languages
//  3. Enter the name of the country. Print the name of the continent
//     (Declare enum with names of continents)
//  4. Create class Product with fields name, price and quantity
//        • Create four instances of type Product
//        • Display the name and quantity of the most expensive item
//        • Display the name of the items, which has the biggest quantity

enum Continent {
    AFRICA("Africa"),
    ANTARCTICA("Antarctica"),
    ASIA("Asia"),
    AUSTRALIA("Australia"),
    EUROPE("Europe"),
    NORTH_AMERICA("North America"),
    SOUTH_AMERICA("South America");

    private final String name;

    Continent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1 point of tasks
        System.out.println("Find out how many of them are odd: ");
        //generate random nums [0;20)
        int first = (int) (Math.random() * 20);
        int second = (int) (Math.random() * 20);
        int third = (int) (Math.random() * 20);
        System.out.println("Nums: " + first + "; " + second + "; " + third + ".");

        int index;
        if (first % 2 != 0 && second % 2 != 0 && third % 2 != 0) {
            index = 3;
        } else if (first % 2 == 0 && second % 2 == 0 && third % 2 == 0) {
            index = 0;
        } else if (first % 2 != 0 && second % 2 != 0 || second % 2 != 0 && third % 2 != 0 || first % 2 != 0 && third % 2 != 0) {
            index = 2;
        } else {
            index = 1;
        }
        System.out.println("How many of them are odd: " + index);


        //2 point
        System.out.print("\nEnter the number of the day of the week: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not day of the week.");
        }
        // Clear buffer
        sc.nextLine();

        //3 point
        Continent continent = null;
        System.out.print("\nEntry country: ");

        String country = sc.nextLine();

        switch (country.toLowerCase()) {
            case "china":
            case "japan":
            case "india":
            case "iran":
            case "south korea":
                continent = Continent.ASIA;
                break;
            case "ukraine":
            case "united kingdom":
            case "turkey":
            case "switzerland":
            case "spain":
                continent = Continent.EUROPE;
                break;
            case "australia":
            case "fiji":
            case "kiribati":
                continent = Continent.AUSTRALIA;
                break;
            case "algeria":
            case "angola":
            case "benin":
            case "botswana":
                continent = Continent.AFRICA;
                break;
            case "canada":
            case "costa rica":
            case "cuba":
                continent = Continent.NORTH_AMERICA;
                break;
            case "argentina":
            case "bolivia":
            case "brazil":
            case "chile":
            case "colombia":
            case "ecuador":
            case "guyana":
                continent = Continent.SOUTH_AMERICA;
                break;
            case "antarctica":
                continent = Continent.ANTARCTICA;
                break;
            default:
                System.out.println("\nNot country.\n");
                break;
        }
        //check
        if (continent != null) {
            System.out.println(continent.getName() + "\n");
        }


        //4 point
        Product product = new Product("Cheese", 31, 2);
        Product product1 = new Product("Milk", 3, 11);
        Product product2 = new Product("Coffee", 17, 7);
        Product product3 = new Product("Water", 1, 21);

        //Display the name and quantity of the most expensive item
        if (product.getPrice() > product1.getPrice() && product.getPrice() > product2.getPrice() && product.getPrice() > product3.getPrice()) {
            product.namePrice();
        } else if (product1.getPrice() > product2.getPrice() && product1.getPrice() > product3.getPrice()) {
            product1.namePrice();
        } else if (product2.getPrice() > product3.getPrice()) {
            product2.namePrice();
        } else {
            product3.namePrice();
        }

        //Display the name of the items, which has the biggest quantity
        if (product.getQuantity() > product1.getQuantity() && product.getQuantity() > product2.getQuantity() && product.getQuantity() > product3.getQuantity()) {
            System.out.println("The biggest quantity:\n" + "Name: " + product.getName());
        } else if (product1.getQuantity() > product2.getQuantity() && product1.getQuantity() > product3.getQuantity()) {
            System.out.println("The biggest quantity:\n" + "Name: " + product1.getName());
        } else if (product2.getQuantity() > product3.getQuantity()) {
            System.out.println("The biggest quantity:\n" + "Name: " + product2.getName());
        } else {
            System.out.println("The biggest quantity:\n" + "Name: " + product3.getName());
        }
        sc.close();
    }

}
