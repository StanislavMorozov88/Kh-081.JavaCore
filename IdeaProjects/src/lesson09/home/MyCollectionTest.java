package lesson09.home;

import java.util.List;

public class MyCollectionTest {
    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();
        myCollection.printList();
        myCollection.swapMinMax();
        System.out.println("myCollection list after swapping: " + myCollection.getMyCollection());

        myCollection.threeDigitBeforeFirstNegative();
        System.out.println("myCollection list after adding 3-digits number before first negative (if any): " + myCollection.getMyCollection());

        myCollection.zeroBetweenDifferentSignNeighbors();
        System.out.println("myCollection list after adding 0 between neighboring elements with different signs: " + myCollection.getMyCollection());

        //Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order.
        List<List<Integer>> listOfLists = myCollection.listOfSublistNFirstRestLast(10);
        System.out.println("List of sublists myCollection: " + listOfLists);

        myCollection.printList();
        myCollection.removeLastEven();
        System.out.println("myCollection after removing last even element(if any): " + myCollection.getMyCollection());

        myCollection.removeAfterFirstMin();
        System.out.println("myCollection after removing the element following the first minimum(if any): " + myCollection.getMyCollection());


    }
}
