package Lesson6.PracticalTasks;

import java.util.Arrays;

public class PrTask1 {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new  Sedan();
        cars[1] = new Truck();
        cars[2] = new Sedan();
        cars[3] = new Truck();
        cars[0].setModel("Pershe");
        cars[0].setYearOfManufacture(2020);
        cars[0].setMaxSpeed(300);
        cars[1].setMaxSpeed(180);
        cars[1].setModel("Volvo");
        cars[1].setYearOfManufacture(2010);
        cars[2].setModel("Nissan");
        cars[2].setYearOfManufacture(2021);
        cars[2].setMaxSpeed(320);
        cars[3].setModel("Toyota");
        cars[3].setMaxSpeed(190);
        cars[3].setYearOfManufacture(2019);

        for (int i = 0; i < cars.length ; i++) {
            cars[i].run();
            cars[i].stop();
        }
        System.out.println(Arrays.toString(cars));
    }
}
