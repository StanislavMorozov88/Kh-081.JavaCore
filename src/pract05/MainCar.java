package pract05;

import java.util.Arrays;

public class MainCar {
    public static void main(String[] args) {

        Car[] cars = new Car[4];
        cars[0] = new Truck("Volvo Wild Viking", 260, 2010);
        cars[1] = new Truck("Jet Truck", 377.7, 2015);
        cars[2] = new Sedan("Lexus LS 500", 421, 2015);
        cars[3] = new Sedan("Audi A6", 250.3, 2014);

        System.out.println(Arrays.toString(cars));
    }
}
