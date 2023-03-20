package edu09.practical;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            int a = random.nextInt(-50, 50);
            myCollection.add(a);
        }
        System.out.println(myCollection);

        System.out.println("---------------------");
        ArrayList<Integer> newCollection = new ArrayList<>();
        for(int i = 0; i < myCollection.size(); i++){
            if (myCollection.get(i) > 5) {
                newCollection.add(myCollection.get(i));
            }
        }
        System.out.println(newCollection);

        System.out.println("---------------------");
        for(int i = 0; i < myCollection.size(); i++){
            if(myCollection.get(i) > 20){
                myCollection.remove(i);
            }
        }
        System.out.println(myCollection);

        System.out.println("---------------------");
        myCollection.set(2,1);
        myCollection.set(1,-3);
        myCollection.set(5,-4);
        for(int i = 0; i < myCollection.size(); i++){
            System.out.println("position - " + i + ", value of element - " + myCollection.get(i));
        }

        System.out.println("---------------------");
        Collections.sort(myCollection);
        System.out.println(myCollection);

    }

}
