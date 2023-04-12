package edu09.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class myCollection {
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<Integer>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers to fill the collection:");
        for (int i = 0; i < 10; i++) {
            int input = scanner.nextInt();
            myCollection.add(input);
        }
        System.out.println("Original collection " + myCollection);

        //Swap the maximum and minimum elements in the list.
        int min = myCollection.get(0);
        int max = myCollection.get(0);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < min) {
                min = myCollection.get(i);
            }
        }
        int minIndex = myCollection.indexOf(min);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > max) {
                max = myCollection.get(i);
            }
        }
        int maxIndex = myCollection.indexOf(max);
        Collections.swap(myCollection, maxIndex, minIndex);
        System.out.println("Swapped collection " + myCollection);

        //Insert a random three-digit number before the first negative element of the list
        int negativeNum = 0;
        int rand1 = random.nextInt(100), rand2 = random.nextInt(100), rand3 = random.nextInt(100);
        for(int i = 0; i < myCollection.size(); i++){
            if(myCollection.get(i) < 0){
                negativeNum = myCollection.get(i);
                myCollection.add(myCollection.indexOf(negativeNum), rand1);
                myCollection.add(myCollection.indexOf(negativeNum), rand2);
                myCollection.add(myCollection.indexOf(negativeNum), rand3);
                break;
            }
        }
        System.out.println("Collection with three random digits " + myCollection);

        //Insert a zero between all neighboring elements collection myCollection with different signs
        for(int i = 1; i < myCollection.size(); i++){
            if(myCollection.get(i - 1) > 0 & myCollection.get(i) < 0){
                myCollection.add(myCollection.indexOf(myCollection.get(i)), 0);
            }
            if(myCollection.get(i - 1) < 0 & myCollection.get(i) > 0) {
                myCollection.add(myCollection.indexOf(myCollection.get(i)), 0);
            }
        }
        System.out.println("Collection with zero " + myCollection);
        System.out.println("Size of the colleciton is --> " + myCollection.size());

        //Copy the first k elements of the myCollection to the list1, in direct order,
        // and the rest to the list2 in reverse order.
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int k = 7;
        for(int i = 0; i < k; i++){
            list1.add(i, myCollection.get(i));
        }
        System.out.println("List1 is -> " + list1);
        for(int i = myCollection.size() - 1; i >= k; i--){
            list2.add(myCollection.get(i));
        }
        System.out.println("List2 is -> " + list2);

        //In a list myCollection remove the last even element (if there are even elements in the list).
        // If there is no such element, display a message.
        int evenIndex = myCollection.size();
        for(int i = myCollection.size() - 1; i >= 0; i--){
            if(myCollection.get(i) % 2 == 0) {
                evenIndex = myCollection.indexOf(myCollection.get(i));
            }else System.out.println("There are no any even numbers in the list.");
            break;
        }
        myCollection.remove(evenIndex);
        System.out.println("Collection without last even number " + myCollection);
        System.out.println("Size of the collection is --> " + myCollection.size());

        //Remove from the list myCollection the element following the first minimum.
        // If the minimum element is the last one, nothing needs to be removed
        try{
            for (int i = 0; i < myCollection.size(); i++) {
                if (myCollection.get(i) < min) {
                    min = myCollection.get(i);
                }
            }
            minIndex = myCollection.indexOf(min);
            myCollection.remove(minIndex + 1);
        }catch(IndexOutOfBoundsException e) {
            System.out.println("The minimum is the last digit in the collection.");
        }
        System.out.println("Collection after removal: " + myCollection);
    }
}
