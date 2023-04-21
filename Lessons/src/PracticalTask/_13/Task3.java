package PracticalTask._13;

import java.util.function.Predicate;

public class Task3 {
    /**
     * Create array Integers which has 10 elements,
     * <br>create method count() that takes an array of integers as the first parameter and functional interface as the second parameter,
     * <br>that functional interface works with integers and defines a condition.
     * <br>Method count() return count of elements in array
     * <br>that satisfy the condition defined by the second argument.
     */
    public static void main(String[] args) {
        int[] ints = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 7, 8};

        Condition<Integer> equalsSeven = i -> i == 7;
        Condition<Integer> biggerThanTree = i -> i > 3;
        Condition<Integer> belowZero = i -> i < 0;

        System.out.println(count(ints, equalsSeven));
        System.out.println(count(ints, biggerThanTree));
        System.out.println(count(ints, belowZero));
    }

    public static int count(int[] integers, Condition<Integer> condition) {
        int count = 0;
        for (Integer integer : integers) {
            if (condition.isCorrect(integer)) {
                count++;
            }
        }
        return count;
    }
}

//Could have used Predicate but don't want to)))
@FunctionalInterface
interface Condition<T> {
    boolean isCorrect(T t);
}