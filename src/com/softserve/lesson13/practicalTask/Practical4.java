package com.softserve.lesson13.practicalTask;

import java.util.function.IntPredicate;

public class Practical4 {
    public static int count(Integer[] arr, IntPredicate predicate) {
        int count = 0;
        for (Integer integer : arr) {
            if (predicate.test(integer)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Create an array of integers
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Define a predicate that checks if an integer is even
        IntPredicate isEven = n -> n % 2 == 0;

        // Count the number of even elements in the array
        int evenCount = count(arr, isEven);

        // Print the result
        System.out.println("The number of even elements in the array is " + evenCount);
    }
}
