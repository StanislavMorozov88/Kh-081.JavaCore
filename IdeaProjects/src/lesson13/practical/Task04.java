package lesson13.practical;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task04 {
    public static int count(List<Integer> list, Predicate<Integer> predicate) {
        return (int) list.stream()
                .filter(predicate)
                .count();
    }

    public static List<Integer> getRandomList(int size) {
        return new Random().ints(size, -100, 100).boxed().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(getRandomList(10));
        System.out.println("List is: " + integerList);

        System.out.println("Number of elements greater than 0: " + count(integerList, integer -> integer > 0));

        System.out.println("Number of elements less than 0: " + count(integerList, integer -> integer < 0));

        System.out.println("Number of even element: " + count(integerList, integer -> integer % 2 == 0));

        System.out.println("Number of odd element: " + count(integerList, integer -> integer % 2 != 0));


    }
}
