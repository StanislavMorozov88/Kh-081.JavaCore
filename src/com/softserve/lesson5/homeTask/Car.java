package com.softserve.lesson5.homeTask;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    private String type;
    private int yearOfProduction;
    private double capacity;

    public Car(String type, int yearOfProduction, double capacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.capacity = capacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", capacity=" + capacity +
                '}';
    }

    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car("Toyota", 1986, 1.6);
        cars[1] = new Car("Honda", 2002, 3.5);
        cars[2] = new Car("Mazda", 1986, 1.3);
        cars[3] = new Car("smart", 2011, 1.0);

        displayByYear(cars);
        orderByYear(cars);

    }

    /**
     * This method asks user to input a year and  displays certain cars maid in this year
     *
     * @param cars array with Cars
     */
    private static void displayByYear(Car[] cars) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        for (Car j : cars) {
            if (j.yearOfProduction == year) {
                System.out.println(j);
            }
        }
    }

    /**
     * This method orders cars by year and displays it
     *
     * @param cars is array with cars
     */
    private static void orderByYear(Car[] cars) {
        Car tmp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].yearOfProduction < cars[j].yearOfProduction) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(cars));
    }

}
