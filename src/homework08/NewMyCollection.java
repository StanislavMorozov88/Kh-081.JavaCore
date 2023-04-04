package homework08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NewMyCollection {
    public static void main(String[] args) {

        ArrayList<Integer> myNewCollection = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(50);
            myNewCollection.add(a);
        }
        System.out.println(myNewCollection);

        int min = myNewCollection.get(0);
        int max = myNewCollection.get(0);
        int n = myNewCollection.size();

        for (int i = 0; i < n; i++) {
            if (myNewCollection.get(i) < min) {
                min = myNewCollection.get(i);
            }
        }
        for (int i = 0; i < n; i++) {
            if (myNewCollection.get(i) > max) {
                max = myNewCollection.get(i);
            }
        }
        System.out.println("Min value is: " + min);
        System.out.println("Max value is: " + max);

        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list1.add(myNewCollection.get(i));
        }
        Collections.sort(list1);
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 5; i < n; i++) {
            list2.add(myNewCollection.get(i));
        }
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);

        int even = myNewCollection.get(0);
        boolean IsEvenNumbersPresentInTheList = false;
        for (int i = 0; i < n; i++) {
            if (myNewCollection.get(i) % 2 == 0) {
                even = myNewCollection.get(i);
                IsEvenNumbersPresentInTheList = true;
            }
        }
        if (!IsEvenNumbersPresentInTheList) {
            System.out.println("There is no even numbers in myMewCollection");
        }

        System.out.println("Last even value is: " + even);
        myNewCollection.remove(Integer.valueOf(even));
        System.out.println(myNewCollection);

        for (int i = 0; i < n-1; i++) {
            if (myNewCollection.get(i) < min) {
                min = myNewCollection.get(i);
            }

        }
        System.out.println("Min value is: " + min + " it is on " + myNewCollection.indexOf(min) + " position");
        myNewCollection.remove(myNewCollection.indexOf(min)+1);
        System.out.println(myNewCollection);
    }
}