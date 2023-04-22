package Lesson14.PracticalTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PrTask2 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        int count = (int)primes.stream()
                .count();

        System.out.println("Count " + count);

        Comparator<Integer> comp = (x1, x2) -> (x1 - x2);

        int min = primes.stream()
                .min(Integer::compareTo)
                        .get();
        System.out.println("Min " + min);

        int max = primes.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println("Max: " + max);

        int sum = primes.stream()
                .reduce(Integer::sum)
                .get();
        System.out.println("Sum " + sum);







    }
}
