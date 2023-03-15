package lesson09.practical;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionMain {
    public static void main(String[] args) {
        //fill list with values
        List<Integer> list = List.of(1, 5, 2, 22, 88, -5, -8, 0, 9, 33);
        List<Integer> myCollection = new ArrayList<>(list);
        System.out.println("myCollection list with 10 elements: " + myCollection);

        //newCollection - is a sublist of myCollection from the 5th position
        /*List<Integer> newCollection = myCollection.subList(5, 10);
        System.out.println("newCollection list is: " + newCollection);*/

        //newCollection contains all the elements from myCollection with values greater than 5
        List<Integer> newCollection = greaterThanFive(myCollection);
        System.out.println("newCollection list with all values greater than 5: " + newCollection);

        //remove all values greater than 20 from myCollection
        myCollection.removeIf(i -> i > 20);
        System.out.println("myCollection with all the values less than 20: " + myCollection);

        //I decided to use map to store index as key and value as values
        Map<Integer, Integer> map = Map.of(2, 1, 8, -3, 5, -4);
        addToDifferentPosition(myCollection, map);
        System.out.println("myCollection after adding values at indexes 2, 8, 5: " + myCollection);


        //sort ascending
        myCollection.sort(Integer::compare);
        System.out.println("myCollection sorted in ascending order: " + myCollection);

        //sort descending
        myCollection.sort(Comparator.reverseOrder());
        System.out.println("myCollection sorted in descending order: " + myCollection);

    }

    public static List<Integer> greaterThanFive(List<Integer> myCollection) {
        return myCollection.stream()
                .filter(integer -> integer > 5)
                .collect(Collectors.toList());
    }

    public static void addToDifferentPosition(List<Integer> myCollection, Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            try {
                myCollection.add(entry.getKey(), entry.getValue());
                System.out.println("position: " + entry.getKey() + ", value of element " + entry.getValue());
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Can't add value of element " + entry.getValue() + " to the position " + entry.getKey());
            }
        }
    }
}
