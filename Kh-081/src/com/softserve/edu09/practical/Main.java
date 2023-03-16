package com.softserve.edu09.practical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declare and fill myCollection with 10 integers
        ArrayList<Integer> myCollection = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an integer for position " + (i+1) + ": ");
            int num = scanner.nextInt();
            myCollection.add(num);
        }

        // find positions of elements greater than 5 and save in newCollection
        ArrayList<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("Positions of elements greater than 5: " + newCollection);

        // remove elements greater than 20 from myCollection
        myCollection.removeIf(n -> n > 20);
        System.out.println("myCollection after removing elements greater than 20: " + myCollection);

        // insert elements 1, -3, -4 in positions 2, 8, 5
        myCollection.add(1, 1);
        myCollection.add(7, -3);
        myCollection.add(4, -4);
        System.out.println("myCollection after inserting elements: " + myCollection);

        // sort myCollection and print
        Collections.sort(myCollection);
        System.out.println("myCollection after sorting: " + myCollection);
    }
}