package lesson3.hw;

import java.util.Scanner;

//  1. Solve the next tasks:
//        • read 3 float numbers and check: are they all belong to the range [-5, 5];
//        • read 3 integer numbers and write max and min of them;
//        • read number of HTTP Error (400, 401,402, ...) and write the name of this error
//          (Declare enum HTTPError)
//  2. Сreate class Dog with fields name, breed, age
//        • Declare enum for field breed
//        • Create 3 instances of type Dog
//        • Check if there is no two dogs with the same name
//        • Display the name and the kind of the oldest dog

//Declare enum HTTPError
enum HTTPError {
    BadRequest("Bad Request"),
    Unauthorized("Unauthorized"),
    PaymentRequired("Payment Required"),
    Forbidden("Forbidden"),
    NotFound("Not Found");
    private final String name;

    HTTPError(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1 point (1)
        System.out.println("\nCheck: are they all belong to the range [-5, 5]");
        //random nums
        float fNum = (float) (Math.random() * (10 + 1)) - 5;
        float fNum1 = (float) (Math.random() * (10 + 1)) - 5;
        float fNum2 = (float) (Math.random() * (10 + 1)) - 5;
        System.out.println("Nums: " + fNum + "; " + fNum1 + "; " + fNum2 + ".");
        if ((fNum > -5 && fNum < 5) && (fNum1 > -5 && fNum1 < 5) && (fNum2 > -5 && fNum2 < 5)) {
            System.out.println("All numbers are belong to the range [-5, 5] ");
        } else {
            System.out.println("NOT all numbers are belong to the range [-5, 5] ");
        }

        //1 point (2)
        System.out.println("\nFind min and max of nums");
        //generate random nums [-20;20]
        int iNum = (int) (Math.random() * (40 + 1)) - 20;
        int iNum1 = (int) (Math.random() * (40 + 1)) - 20;
        int iNum2 = (int) (Math.random() * (40 + 1)) - 20;
        System.out.println("Nums: " + iNum + "; " + iNum1 + "; " + iNum2 + ".");

        int min = iNum;
        int max = iNum;

        //find min
        if (min > iNum1) {
            min = iNum1;
        }
        if (min > iNum2) {
            min = iNum2;
        }
        System.out.println("Minimum: " + min);

        //find max
        if (max < iNum1) {
            max = iNum1;
        }
        if (max < iNum2) {
            max = iNum2;
        }
        System.out.println("Maximum: " + max);


        //1 point (3)
        HTTPError httpError = null;
        System.out.print("\nEnter HTTP Error (400, 401, 402, 403, 404): ");
        int numError = sc.nextInt();

        switch (numError) {
            case 400:
                httpError = HTTPError.BadRequest;
                break;
            case 401:
                httpError = HTTPError.Unauthorized;
                break;
            case 402:
                httpError = HTTPError.PaymentRequired;
                break;
            case 403:
                httpError = HTTPError.Forbidden;
                break;
            case 404:
                httpError = HTTPError.NotFound;
                break;
            default:
                System.out.println("Wrong index.");
                break;
        }
        if (httpError != null) {
            System.out.println(httpError.getName());
        }

        // 2 point
        Dog.Breed breed;
        Dog dog = new Dog("Loki", breed = Dog.Breed.Bulldog, 1);
        Dog dog1 = new Dog("Loki", breed = Dog.Breed.Akita, 9);
        Dog dog2 = new Dog("Luna", breed = Dog.Breed.Husky, 3);

        System.out.println("\nAre there two dogs with the same name?");
        //Check if there is no two dogs with the same name
        System.out.println("Check the first and the second dog: " + dog.equals(dog1));
        System.out.println("Check the second and the third dog: " + dog1.equals(dog2));

        //Display the name and the kind of the oldest dog
        if (dog.getAge() > dog1.getAge() && dog.getAge() > dog2.getAge()) {
            System.out.println("\nThe oldest dog:\nName: " + dog.getName() + "\nBreed: " + dog.getBreed());
        }else if (dog1.getAge() > dog2.getAge()) {
            System.out.println("\nThe oldest dog:\nName: " + dog1.getName() + "\nBreed: " + dog1.getBreed());
        }else {
            System.out.println("\nThe oldest dog:\nName: " + dog2.getName() + "\nBreed: " + dog2.getBreed());
        }

        sc.close();
    }
}
