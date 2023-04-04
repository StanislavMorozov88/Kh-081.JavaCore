package lesson14.practical;

import java.util.Arrays;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        int size = (int) primes.stream()
                .count();

        int min = primes.stream()
                .min(Integer::compareTo)
                .orElse(0);

        int max = primes.stream()
                .max(Integer::compareTo)
                .orElse(0);

        int sum = primes.stream()
                .reduce(Integer::sum)
                .orElse(0);

        System.out.println("List: " + primes);
        System.out.printf("Number of elements: %d, Min value: %d, Max value: %d, Sum of elements: %d%n", size, min, max, sum);

    }
}
