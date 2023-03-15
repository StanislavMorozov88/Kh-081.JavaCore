package lesson09.home;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyCollection {
    private List<Integer> myCollection;

    public MyCollection() {
        myCollection = getRandomList(-100, 100, 10);
    }

    public void swapMinMax() {
        int indexMin = myCollection.indexOf(Collections.min(myCollection));
        int indexMax = myCollection.indexOf(Collections.max(myCollection));
        if (indexMin != indexMax) {
            Collections.swap(myCollection, indexMin, indexMax);
        }
    }

    public void threeDigitBeforeFirstNegative() {
        List<Integer> toAdd = getRandomList(-10, 10, 3);
        myCollection = new LinkedList<>(myCollection);
        Integer firstNegative = myCollection.stream()
                .filter(t -> t < 0)
                .findFirst()
                .orElse(null);
        int indexOfNegative;
        if (firstNegative != null) {
            indexOfNegative = myCollection.indexOf(firstNegative);
            myCollection.addAll(indexOfNegative, toAdd);
            System.out.println("Adding a list " + toAdd + " to a position " + indexOfNegative);
        } else System.out.println("No negative number in a list");
    }

    public void zeroBetweenDifferentSignNeighbors() {
        myCollection = new LinkedList<>(myCollection);
        for (int i = 1; i < myCollection.size(); i++) {
            if (isDifferentSigNeighbors(myCollection.get(i), myCollection.get(i - 1))) {
                myCollection.add(i, 0);
            }
        }
    }

    public List<List<Integer>> listOfSublistNFirstRestLast(int count) {
        myCollection = new ArrayList<>(myCollection);
        List<Integer> firstN = new ArrayList<>(myCollection.subList(0, count));
        List<Integer> restRevers = new ArrayList<>(myCollection.subList(count, myCollection.size()));
        Collections.reverse(restRevers);
        return Stream.of(firstN, restRevers).collect(Collectors.toList());
    }

    private boolean isDifferentSigNeighbors(Integer first, Integer second) {
        return first > 0 && second < 0 || first < 0 && second > 0;
    }

    public void removeLastEven() {
        int size = myCollection.size();
        ListIterator<Integer> listIterator = myCollection.listIterator(size);
        while (listIterator.hasPrevious()) {
            if (listIterator.previous() % 2 == 0) {
                listIterator.remove();
                break;
            }
        }
        if (size == myCollection.size()) {
            System.out.println("No even elements in the list");
        }
    }

    public void removeAfterFirstMin() {
        int indexMin = myCollection.indexOf(Collections.min(myCollection));
        if (indexMin + 1 < myCollection.size()) {
            myCollection.remove(indexMin + 1);
        }
    }

    public static List<Integer> getRandomList(int min, int max, int size) {
        return new Random().ints(size, min, max)
                .boxed().collect(Collectors.toList());
    }

    public List<Integer> getMyCollection() {
        return myCollection;
    }

    public void printList() {
        System.out.println("myCollection list is: " + myCollection);
    }
}
