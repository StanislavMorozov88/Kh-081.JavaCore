package com.softserve.lesson9.practicalTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Practical {
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            myCollection.add(RandomGenerator.getDefault().nextInt(-100, 100));
        }

        System.out.println(myCollection);

        ArrayList<Integer> newCollection = new ArrayList<>();

        for (int i = 0; i < myCollection.size(); i++){
            if (myCollection.get(i) > 5){
                newCollection.add(i);
            }
        }

        System.out.println(newCollection);

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
            }
        }

        System.out.println(myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position – " + i + ", value of element – " + myCollection.get(i));
        }
        Collections.sort(myCollection);
        System.out.println(myCollection);
    }
}
