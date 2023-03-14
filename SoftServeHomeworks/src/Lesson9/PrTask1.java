package Lesson9;

import java.lang.reflect.Array;
import java.util.*;

public class PrTask1 {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList();
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int rnd = r.nextInt(-20,50);
            myCollection.add(rnd);
        }
        System.out.println("Default myCollection: " + myCollection);
        System.out.println();


        List<Integer> newCollection = new ArrayList();
        for (int i = 0; i < myCollection.size() ; i++) {
            if(myCollection.get(i) > 5){
                newCollection.add(myCollection.get(i));
            }
        }
        System.out.println("newCollection where ints bigger than 5: " + newCollection);
        System.out.println();



        myCollection.removeIf(x-> x > 20); // Знайшов тільки такий спосіб для видалення
        System.out.println("myCollection less than 20: " + myCollection);
        System.out.println();


        myCollection.set(0, 1);
        myCollection.set(1, -3);
        myCollection.set(2, -4);

        System.out.println("My collection with new elements: " + myCollection);
        System.out.println();


        myCollection.sort(Comparator.naturalOrder());
        System.out.println("Sorted collection: " + myCollection);
    }
}

