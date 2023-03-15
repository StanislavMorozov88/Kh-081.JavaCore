package Homework._5.Task4;

import Experiments.ConsoleMenuWrap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car[] cars = {new Car("Volvo", 2000, 1.2),
                      new Car("Renault", 2004, 0.8),
                      new Car("Fiat", 2012, 2.0),
                      new Car("Toyota", 2004, 2.2)};

        ConsoleMenuWrap menu = new ConsoleMenuWrap();
        menu.addLine("There is available cars: ");
        for (Car car: cars){
            menu.addLine(car.toString());
        }
        menu.addLine("Enter the model year of your choice: ");
        menu.show();
        menu.clear();

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        Car[] carsTempArr = Car.getCarsOfYear(year);
        sc.close();

        menu.addLine("Here are all the cars of the " + year + " year: ");
        for (Car car: carsTempArr){
            menu.addLine(car.toString());
        }
        menu.show();
        menu.clear();

        carsTempArr = Car.getSortedCars();
        menu.addLine("Complete ordered list of cars:");
        for (Car car: carsTempArr){
            menu.addLine(car.toString());
        }
        menu.show();
        menu.clear();
    }
}
/*
        Create class Car with fields type, year of production and engine capacity.
        Create and initialize four instances of class Car. Display cars
        certain model year  (enter year in the console);
        ordered by the field year.
*/
