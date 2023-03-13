package lesson09.practical;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionMain {
    public static void main(String[] args) {
        //fill list with values
        List<Integer> myCollection = fillList();
        System.out.println("myCollection list with 10 elements: " + myCollection);

        //new list - is a sublist of myCollection from the 5th position
        List<Integer> newCollection = myCollection.subList(5, 10);
        System.out.println("newCollection list is: " + newCollection);

        //remove all values greater than 20 from myCollection (with stream)
        //just uncomment
        /*myCollection = listOfGreaterThanTwenty(myCollection);
        System.out.println(myCollection);*/

        /*remove all values greater than 20 from myCollection using iterator.
        I changed the original list as it was agreed at the lecture. But I can pass copy of original list and return new list as needed.*/
        /*listOfGreaterThanTwentyWithIterator(myCollection);
        System.out.println(myCollection);*/


        //or we can just use
        myCollection.removeIf(i -> i > 20);
        System.out.println("myCollection with all the values less than 20: " + myCollection);


        //I decided to use map to store index as key and value as values
        Map<Integer, Integer> map = Map.of(2, 1, 8, -3, 5, -4);
        addToDifferentPosition(myCollection, map);
        System.out.println("myCollection after adding values at indexes 2, 8(unsuccessfully), 5: " + myCollection);

        //sort ascending
        myCollection.sort(Integer::compare);
        System.out.println("myCollection sorted in ascending order: " + myCollection);

        //sort descending
        myCollection.sort(Comparator.reverseOrder());
        System.out.println("myCollection sorted in descending order: " + myCollection);


    }

    public static void listOfGreaterThanTwentyWithIterator(List<Integer> myCollection) {
        Iterator<Integer> myCollectionIter = myCollection.iterator();
        while (myCollectionIter.hasNext()) {
            if (myCollectionIter.next() > 20) {
                myCollectionIter.remove();
            }
        }
    }

    public static List<Integer> listOfGreaterThanTwenty(List<Integer> myCollection) {
        return myCollection.stream()
                .filter(i -> i <= 20)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static void addToDifferentPosition(List<Integer> myCollection, Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            try {
                myCollection.add(entry.getKey(), entry.getValue());
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Size of list to small");
            }
        }
    }

    public static List<Integer> fillList() {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i * i);
        }
        return integerList;
    }
}
