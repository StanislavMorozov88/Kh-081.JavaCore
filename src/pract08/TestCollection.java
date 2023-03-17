package pract08;

import javax.security.auth.login.CredentialNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<Integer>();
        myCollection.add(10);
        myCollection.add(4);
        myCollection.add(675);
        myCollection.add(56);
        myCollection.add(1);
        myCollection.add(1);
        myCollection.add(45);
        myCollection.add(2);
        myCollection.add(31);
        myCollection.add(-35);

        System.out.println(myCollection);

        ArrayList<Integer> newCollection = new ArrayList<>();

        for (int i = 5; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(myCollection.get(i));
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

        System.out.println(myCollection);
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position - " + i + ", value of element - " + myCollection.get(i));
        }

        Collections.sort(myCollection);
        System.out.println(myCollection);
    }
}
