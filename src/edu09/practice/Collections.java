package edu09.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Collections {
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<Integer>(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers to fill the collection:");
        for (int i = 0; i < 10; i++) {
            int input = scanner.nextInt();
            myCollection.add(input);
        }

        ArrayList<Integer> newCollection = new ArrayList<Integer>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("Positions of elements more than 5: " + newCollection);

        ArrayList<Integer> elementsToRemove = new ArrayList<Integer>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                elementsToRemove.add(i);
            }
        }
        for (int i = elementsToRemove.size() - 1; i >= 0; i--) {
            myCollection.remove((int)elementsToRemove.get(i));
        }
        System.out.println("After removing elements greater than 20: " + myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        System.out.println("After inserting elements: " + myCollection);

        System.out.println("Inserted elements:");
        System.out.println("Position - " + 2 + ", value of element - " + myCollection.get(2));
        System.out.println("Position - " + 8 + ", value of element - " + myCollection.get(8));
        System.out.println("Position - " + 5 + ", value of element - " + myCollection.get(5));

        // Sort and print collection
        myCollection.sort(null);
        System.out.println("Sorted collection: " + myCollection);
    }
}