package lesson4.pt;

//    Create an array of ten integers.
//      Display
//        the biggest of these numbers;
//        the sum of positive numbers in the array;
//        the amount of negative numbers in the array.
//    What values there are more: negative or positive?

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int l = sc.nextInt();
        int[] arr = new int[l];

        fillArray(arr);
        printArray(arr);

        //display the biggest of these numbers;
        System.out.println("The biggest of these numbers: " + findBiggestNum(arr));
        //the sum of positive numbers in the array;
        System.out.println("The sum of positive numbers in the array: " + sumPosArrayNums(arr));
        //What values there are more: negative or positive?
        whatMore(arr);
    }

    private static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //filling array with random nums [-10; 10]
            arr[i] = (int) (Math.random() * (20 + 1)) - 10;
        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    //the biggest of these numbers;
    private static int findBiggestNum(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //the sum of positive numbers in the array;
    private static int sumPosArrayNums(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //skip negative nums
            if (arr[i] < 0) {
                continue;
            }
            //count sum
            sum += arr[i];
        }
        return sum;
    }

    //the amount of negative numbers in the array.
    private static int amountNegArrayNums(int[] arr) {
        int amount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                continue;
            }
            amount++;
        }
        return amount;
    }

    //What values there are more: negative or positive?
    private static void whatMore(int[] arr) {
        int countPos = 0;
        int countNeg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPos++;
            } else {
                countNeg++;
            }
        }
        if (countPos > countNeg) {
            System.out.println("More positive values!");
        } else if (countPos < countNeg) {
            System.out.println("More negative values!");
        } else {
            System.out.println("Same!");
        }
    }
}
