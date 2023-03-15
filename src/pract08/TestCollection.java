package pract08;

import javax.security.auth.login.CredentialNotFoundException;
import java.util.ArrayList;

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

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(myCollection.get(i));
            }

            //System.out.println(newCollection);

        }
        System.out.println(newCollection);

    }
}
