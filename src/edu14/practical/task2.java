package edu14.practical;

import javax.management.StringValueExp;
import java.util.*;
import java.util.stream.Collectors;

public class task2 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream()
                .mapToInt((x) -> x).summaryStatistics();

        System.out.println("Count = " + stats.getCount());
        System.out.println("Min = " + stats.getMin());
        System.out.println("Max = " + stats.getMax());
        System.out.println("Sum = " + stats.getSum());

    }
}
