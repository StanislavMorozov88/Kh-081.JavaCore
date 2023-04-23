package lesson12.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * 1)Show which today is a day of a week
 * 2)Show a date of first Monday for current month
 * 3)Write a method for sorting list of Strings using Java 8
 * 4)Create array Integers which has 10 elements, create method count()
 * that takes an array of integers as the first parameter
 * and functional interface as the second parameter,
 * that functional interface works with integers and defines a condition.
 * Method count() return count of elements in array that satisfy the condition defined by the second argument.
 */
public class Main {
    public static void main(String[] args) {
        //1
        LocalDate localDate = LocalDate.now();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);

        //2
        LocalDate firstMonday = LocalDate.of(2023, 1, 1);
        while (firstMonday.getDayOfWeek() != DayOfWeek.MONDAY) {
            firstMonday = firstMonday.plusDays(1);
        }
        System.out.println(firstMonday);

        //3
        List<String> strings = Arrays.asList("aaY4uNoR", "hXF", "CnXp", "Pxm8", "IA4", "sgy", "frpgXAF");
        sortStrings(strings);
        System.out.println(strings);

        //4
        int[] nums = new int[10];
        for (Integer i : nums) {
            i = (int) (Math.random() * 10);
            System.out.print(i + " ");
        }
        System.out.println(" ");
        Arrays.stream(nums).forEach(i -> {
            i = (int) (Math.random() * 10);
            System.out.print(i + " ");
        });
        // Define a predicate that checks if an integer is even
        IntPredicate isEven = n -> n % 2 == 0;

        // Count the number of even elements in the array
        int evenCount = count(nums, isEven);

        // Print the result
        System.out.println("The number of even elements in the array is " + evenCount);


    }
    //for 4 task
    public static int count(int[] arr, IntPredicate predicate){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public static void sortStrings(List<String> strings) {
        Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));
    }
}