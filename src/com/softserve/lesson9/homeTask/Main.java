package com.softserve.lesson9.homeTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.random.RandomGenerator;

public class Main {

    private static final int K = 5; // k elements from 4 point of task

    public static void main(String[] args) {

        /* Initializing list with random numbers */
        LinkedList<Integer> myCollection = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            myCollection.add(RandomGenerator.getDefault().nextInt(-100, 100));
        }

        /* finding and swapping min and max values */
        int min = findMin(myCollection);
        int max = findMax(myCollection);
        Collections.swap(myCollection, myCollection.indexOf(min),myCollection.indexOf(max));

        /* Adding 3 digit number before first negative number */
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, RandomGenerator.getDefault().nextInt(100, 999));
                break;
            }
        }

        /* Adding zero between different elements with different signs */
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if ((myCollection.get(i) > 0 && myCollection.get(i + 1) < 0) || (myCollection.get(i + 1) > 0 && myCollection.get(i) < 0)) {
                myCollection.add(i + 1, 0);
            }
        }

        /* making list 1 with first k elements */
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            list1.add(myCollection.get(i));
        }

        /* making list 2 with last elements from myCollection */
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = myCollection.size() - 1; i >= K; i--) {
            list2.add(myCollection.get(i));
        }

        /* removing last even number or displaying message */
        int even = 0;
        for (Integer i : myCollection) {
            if(i % 2 == 0 && i != 0){
                even = i;
            }
        }
        if(even == 0) {
            System.out.println("There are no even numbers");
        } else {
            myCollection.remove(myCollection.indexOf(even));
        }

        /* removing element following first minimum */
        min = Collections.min(myCollection);
        if(!(myCollection.indexOf(min) == myCollection.size() - 1)) {
            myCollection.remove(myCollection.indexOf(min) + 1);
        }

        System.out.println(myCollection);
    }

    /**
     * method to find max value in list
     */
    private static int findMax(LinkedList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (Integer integer : list) {
            if (integer > max) {
                max = integer;
            }
        }
        return max;
    }

    /**
     * method to find min value in list
     */
    private static int findMin(LinkedList<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (Integer integer : list) {
            if (integer < min) {
                min = integer;
            }
        }
        return min;
    }

}
