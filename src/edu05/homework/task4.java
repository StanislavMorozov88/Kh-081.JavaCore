package edu05.homework;

import edu05.practical.Employee;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
    Car[] cars = {
            new Car("Sedan",2015,1.6),
            new Car("Hatchback", 2015, 2),
            new Car("Minivan",2020, 2.5),
            new Car("Cabriolet", 2023, 2)
    };

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year of production: 2015, 2020 or 2023");
        int year = scan.nextInt();
        scan.close();

        System.out.println("Input the year " + year);

        System.out.println();
        for (Car car: cars){
            if(car.getYear()== year)
                System.out.println(car);
        }

        for(int i = 0; i < cars.length - 1; i++){
            for(int j = i + 1; j < cars.length; j++){
                if(cars[i].getYear() > cars[j].getYear()){
                    Car temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Cars are ordered by the field year.");
        for(Car car : cars){
            System.out.println(car);
        }


    }
}
