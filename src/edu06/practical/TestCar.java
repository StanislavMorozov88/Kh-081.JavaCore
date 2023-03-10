package edu06.practical;

import java.util.Arrays;

public class TestCar {
    public static void main(String[] args) {
        Car[] cars = {
                new Truck("Toyota", 220, 2005),
                new Sedan("Mercedes", 260, 2010),
                new Truck("Kia", 240, 2015),
                new Sedan("Audi", 280, 2020)
        };

        for (Car car: cars) {
            System.out.println(car);
        }

        for(int i = 0; i < cars.length; i++){
            cars[i].run();
        }

        for (int i = 0; i < cars.length; i++){
            cars[i].stop();
        }
    }
}
