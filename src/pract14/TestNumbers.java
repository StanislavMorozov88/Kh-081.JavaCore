package pract14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestNumbers {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        System.out.println(primes);

        List<Integer> sum = Collections.singletonList(primes.stream()
                .reduce(0, (subtotal, element) -> subtotal + element));
        System.out.println("Sum of numbers is: " + sum);

        List<Integer> maxValue = Collections.singletonList(primes.stream()
                .max(Comparator.comparing(Integer::valueOf))
                .get());
        System.out.println("Max value is: " + maxValue);

        List<Integer> minValue = Collections.singletonList(primes.stream()
                .min(Comparator.comparing(Integer::valueOf))
                .get());
        System.out.println("Min value is: " + minValue);

        List<Integer> countValues = Collections.singletonList(Math.toIntExact(primes.stream()
                .count()));
        System.out.println("The count of numbers is: " + countValues);

    }
}
