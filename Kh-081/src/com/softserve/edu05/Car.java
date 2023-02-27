package com.softserve.edu05;

import java.util.Arrays;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return year + " " + make + " " + model;
    }
}

class Demo {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("Honda", "Civic", 2019);
        cars[1] = new Car("Toyota", "Camry", 2020);
        cars[2] = new Car("Ford", "Mustang", 2021);

       System.out.println(Arrays.toString(cars));
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}