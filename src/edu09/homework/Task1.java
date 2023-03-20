package edu09.homework;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            int a = random.nextInt(-50, 50);
            myCollection.add(a);
        }
        System.out.println("Starter myCollection : " + myCollection);

        System.out.println("------------------------");
        Collections.sort(myCollection);
        System.out.println("Sorted myCollection");
        System.out.println(myCollection);
        int min = myCollection.get(0);
        int max = myCollection.get(9);
        myCollection.set(0,max);
        myCollection.set(9,min);
        System.out.println("Swap max and min:");
        System.out.println(myCollection);

        System.out.println("-------------------------");
        int b = random.nextInt(-999,999);
        myCollection.add(1, b);
        System.out.println("Insert a random three-digit number before the first negative element of the list:");
        System.out.println(myCollection);

        System.out.println("-------------------------");
        System.out.println("Insert a zero between all neighboring elements collection with different signs:");
        for(int i = 0; i < myCollection.size() - 1; i ++){
            if(myCollection.get(i) < 0 & myCollection.get(i+1) > 0){
                myCollection.add(i+1, 0);
            } else if (myCollection.get(i) > 0 & myCollection.get(i+1) < 0) {
                myCollection.add(i+1, 0);
            }
        }
        System.out.println(myCollection);

        System.out.println("-------------------------");
        System.out.println("Copy the first k elements to the list1, in direct order, " +
                "and the rest to the list2 in reverse order.");
        System.out.println("Size = " + myCollection.size());
        int k = random.nextInt(3,7);
        System.out.println("k = " + k);

        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < k; i++){
            list1.add(myCollection.get(i));
        }
        System.out.println("List1: " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = myCollection.size()-1; i >= k; i--){
            list2.add(myCollection.get(i));
        }
        System.out.println("List2: " + list2);


        System.out.println("----------------------------------------");
        System.out.println("myCollection after all steps: ");
        System.out.println(myCollection);
        for(int i = myCollection.size() - 1; i >= 0; i--){
            if(myCollection.get(i) % 2 == 0 & myCollection.get(i) != 0){
                myCollection.remove(i);
                break;
            } else if (myCollection.get(0) % 2 != 0){
                System.out.println("There aren't even elements.");
            }
        }

        System.out.println("myCollection without the last even element:");
        System.out.println(myCollection);

        System.out.println("----------------------------------------");
        int minimum = myCollection.get(0);
        int indexMinimum = 0;
        int j = 0;
        while (j < myCollection.size()){
            if(myCollection.get(j) < minimum){
                minimum = myCollection.get(j);
                indexMinimum = j;
            }
            j++;
        }

        System.out.println("minimum = " + minimum);
        System.out.println("indexMinimum = " + indexMinimum);

        if(indexMinimum != myCollection.size()-1){
            myCollection.remove(indexMinimum+1);
        }

        System.out.println("MyCollection without the element following the first minimum:");
        System.out.println(myCollection);

    }
}
