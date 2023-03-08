package com.softserve.lesson6.practicalTask.car;

public class CarMain {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Sedan("sedan0", 200, 2000);
        cars[1] = new Truck("truck0", 100, 1999);
        cars[2] = new Sedan("sedan1", 250, 2015);
        cars[3] = new Truck("truck0", 115, 2005);

        for (Car j : cars){
            System.out.println(j);
        }
    }

}
