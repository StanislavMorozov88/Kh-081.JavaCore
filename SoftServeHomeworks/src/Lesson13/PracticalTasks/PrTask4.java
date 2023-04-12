package Lesson13.PracticalTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class PrTask4 {
    public static long count(List<Integer> list, Predicate<Integer> pr){
        return list.stream()
                .filter(pr)
                .count();


    }
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(-10,10));
        }
        System.out.println(list);
        System.out.println("List with positive ints: " + count(list,x -> x < 0));
        System.out.println("List with negative ints: " + count(list,x -> x > 0));
        System.out.println("List with even ints: " + count(list,x -> x%2==0));
        System.out.println("List with odd ints: " + count(list,x -> x%2!=0));


    }
}
