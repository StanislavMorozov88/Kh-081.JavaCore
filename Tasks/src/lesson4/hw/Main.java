package lesson4.hw;

//1.   Ask user to enter the number of month.
//      Read the value and write the number of days in this month
//      (create array with amount days of each month).
//2.   Enter 10 integer numbers.
//      Calculate the sum of first 5 elements if they are positive
//      or product of last 5 element in the other case.
//3.   Enter 5 integer numbers. Find
//        position of second positive number;
//        minimum and its position in the array.
//      Count the product of all entered even numbers.
//4.   Create class Car with fields type, year of production and engine capacity.
//     Create and initialize four instances of class Car.
//      Display cars
//        certain model year  (enter year in the console);
//        ordered by the field year.
//5*.  Add Unit Tests to each task, publish code on GitHub

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.
        Scanner sc = new Scanner(System.in);
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        try {
            System.out.print("Enter num of month: ");
            int month = sc.nextInt();
            //check if input is correct
            if (month <= daysInMonth.length && month > 0) {
                //write the number of days in this month
                System.out.println("Days in this month: " + daysInMonth[month - 1]);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.err.println("Wrong input." + "\n");
        }
        System.out.println(" ");

        //2.
        int[] nums = new int[10];
        System.out.println("Enter 10 integer numbers(expect 0):");
        try {
            //input in console
            inputArr(nums);
            //display array
            printArray(nums);
            //calculate the sum or product
            calc(nums);
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }


        //3
        int[] arr = new int[5];
        try {
            //input in console
            inputArr(arr);
            //display array
            printArray(arr);
            //position of second positive number;
            secondPosNum(arr);
            //minimum and its position in the array.
            findMin(arr);

        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }


        sc.close();
    }

    //support methods

    //input nums of array in the console
    private static void inputArr(int[] arr) {
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter the " + (i + 1) + " number: ");
                arr[i] = sc.nextInt();
                //check if input is correct
                for (int j = 0; j < 1; ) {
                    if (arr[i] == 0) {
                        System.out.println("Enter another num(expect 0) pls: ");
                        arr[i] = sc.nextInt();
                    } else {
                        j = 1;
                    }
                }
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Input correct num." + "\n");
        }
    }

    //method for test
    //autofill array with random nums, zero include
    private static void fillArrayRandom(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //[-10;10]
            arr[i] = (int) (Math.random() * (20 + 1) - 10);
        }
    }

    //print array
    private static void printArray(int[] arr) {
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("");
    }


    //minimum and its position in the array.
    private static void findMin(int[] arr) {
        int min = arr[0];
        int iMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                iMin = i;
            }
        }
        System.out.println("Minimum: " + min + ", position in the array: " + (iMin + 1));
    }

    //position of second positive number;
    private static void secondPosNum(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
            if (count == 2) {
                System.out.println("Position of second positive number: " + (i + 1));
                break;
            }
        }
        if (count < 2) {
            System.out.println("No second positive number in array :(");
        }
    }

    //Calculate the sum of first 5 elements if they are positive
    //or product of last 5 element in the other case.
    private static void calc(int[] arr) {
        int sum = 0;
        int prod = 1;

        //count sum
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            } else { //if there is negative num, just set sum = 0 and break the loop
                sum = 0;
                break;
            }
        }
        //if sum == 0(line 152), count product of nums
        if (sum == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i >= arr.length / 2) {
                    prod *= arr[i];
                }
            }
        }
        if (sum > 0) {
            System.out.println("The sum of first 5 elements: " + sum);
        } else {
            System.out.println("Product of last 5 element: " + prod);
        }
    }
}
