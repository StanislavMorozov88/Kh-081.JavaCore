package edu05.homework.car;

import java.util.Scanner;

public class Car {
    private String type;
    private int year;
    private double engine_capacity;

    public Car(String type, int year, double engine_capacity) {
        this.type = type;
        this.year = year;
        this.engine_capacity = engine_capacity;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public double getEngine_capacity() {
        return engine_capacity;
    }

    @Override
    public String toString() {
        return "Car -> " +
                "type " + type + "|" +
                ", year " + year + "|" +
                ", engine_capacity " + engine_capacity;
    }
}
class Main{
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car("Sedan", 2022, 5.2);
        cars[1] = new Car("Jeep", 2022, 3.5);
        cars[2] = new Car("Truck", 2015, 2.2);
        cars[3] = new Car("Classic", 2017, 3.2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year of the model, \n\twhich you want to be displayed");
        int wantedYear = sc.nextInt();
        for(int i = 0; i < cars.length; i++){
            if(cars[i].getYear() == wantedYear)
                System.out.println("The car from the wanted year: "  + cars[i]);
            else if(cars[i].getYear() != wantedYear) break;
        }
        System.out.println("There are no such car in the array. Sorry.");

    }
}
