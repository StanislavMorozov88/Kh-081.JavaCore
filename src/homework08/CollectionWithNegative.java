package homework08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionWithNegative {
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<Integer>();
        myCollection.add(10);
        myCollection.add(-4);
        myCollection.add(675);
        myCollection.add(56);
        myCollection.add(-1);
        myCollection.add(1);
        myCollection.add(45);
        myCollection.add(2);
        myCollection.add(31);
        myCollection.add(-35);

        System.out.println(myCollection);

        Random random = new Random();

        List<Integer> newCollection = new ArrayList<>();
        boolean isNegativeFound = false;
        for (int i = 0; i < myCollection.size(); i++) {

            if (myCollection.get(i) < 0 && !isNegativeFound) {
                isNegativeFound = true;
                for (int j = 0; j < 3; j++) {
                    newCollection.add(random.nextInt(50));
                }
            }
            newCollection.add(myCollection.get(i));
        }

        System.out.println(newCollection);
    }

}


