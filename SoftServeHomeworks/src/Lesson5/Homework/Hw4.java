package Lesson5.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        Car c1 = new Car("gasoline", 2004, 1.5f);
        Car c2 = new Car("diesel", 2002, 1.6f);
        Car c3 = new Car("gasoline", 2001, 1.7f);
        Car c4 = new Car("diesel", 2003, 1.8f);
        Car temp = new Car("ewq",1,1);
        Scanner scan = new Scanner(System.in);
        Car[] cars = new Car[4];
        cars[0] = c1;
        cars[1] = c2;
        cars[2] = c3;
        cars[3] = c4;
        System.out.println("Enter the model year: ");
        int sc = scan.nextInt();
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYearOfProduction() == sc) {
                System.out.println(cars[i]);
            }
        }

            if (cars[0].getYearOfProduction() != sc && cars[1].getYearOfProduction() != sc && cars[2].getYearOfProduction() != sc && cars[3].getYearOfProduction() != sc) {
                System.out.println("There is no car this year production");
            }

        for (int i = 0; i < cars.length-1; i++) {
            for (int j = i+1; j < cars.length; j++) {
                if(cars[i].getYearOfProduction() > cars[j].getYearOfProduction()){
                    temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
        System.out.println("Cars sorted by year of production: " + Arrays.toString(cars));
        scan.close();
        }
    }

