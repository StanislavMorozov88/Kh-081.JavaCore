package lesson4.hw;

//4.   Create class Car with fields type, year of production and engine capacity.
//     Create and initialize four instances of class Car.
//      Display cars
//        certain model year  (enter year in the console);
//        ordered by the field year.

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        //Create and initialize four instances of class Car.
        cars[0] = new Car("universal", 2019, 190);
        cars[1] = new Car("sport car", 2003, 320);
        cars[2] = new Car("pickup", 2019, 310);
        cars[3] = new Car("minivan", 2005, 200);

        printCars(cars);

        //certain model year  (enter year in the console);
        System.out.print("\nEnter model year: ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        System.out.println("Models " + data + " year: ");
        displayByYear(cars, data);

        System.out.println("\nOrdered by the field year:");
        //ordered by the field year.
        sortByYear(cars);
        //display
        printCars(cars);
    }

    private static void printCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }

    private static void displayByYear(Car[] cars, int data) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYear() == data) {
                System.out.println(cars[i].toString());
            }
        }
    }

    private static void sortByYear(Car[] cars) {
        Car temp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYear() < cars[j].getYear()) {
                    temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
    }
}
