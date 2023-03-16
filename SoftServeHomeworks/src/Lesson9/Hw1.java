package Lesson9;

import java.util.*;

public class Hw1 {
    public static void main(String[] args) {
        List<Integer> myCollection = new LinkedList<>();
        int k = 6;
        int tempForLastIndex=0;

        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int rnd = r.nextInt(-40,50);
            myCollection.add(rnd);
        }
        System.out.println(myCollection);
        System.out.println("*********************");


            int max = myCollection.indexOf(Collections.max(myCollection));
            int min = myCollection.indexOf(Collections.min(myCollection));
            Collections.swap(myCollection, max, min);
            System.out.println("Swaped the maximum and minimum elements in the myCollection: "+ myCollection);
        System.out.println("*********************");



            for (int i = 0; i < myCollection.size(); i++) {
            if(myCollection.get(i)<0){
                myCollection.add(i, r.nextInt(-9,9)*100);
                break;
            }
        }
        System.out.println("random three-digit number before the first negative element of the myCollection: " + myCollection);
        System.out.println("*********************");

        for (int i = 0; i < myCollection.size() -1; i++) {
            if(myCollection.get(i)> 0 && myCollection.get(i+1) < 0 || myCollection.get(i) < 0 && myCollection.get(i+1)> 0 ){
                myCollection.add(i+1, 0);
            }
        }
        System.out.println("Inserted a zero between all neighboring elements collection myCollection with different signs: " + myCollection);
        System.out.println("*********************");

        List<Integer> list1 = myCollection.subList(0,k);
        System.out.println("Copied the first k elements of the myCollection to the list1, in direct order: " + list1);
        System.out.println("*********************");

        List<Integer> list2 = myCollection.subList(k,myCollection.size());
        Collections.reverse(list2);
        System.out.println("The rest to the myCollection in reverse order: " + list2);
        System.out.println("*********************");

        for (int i = 0; i < myCollection.size(); i++) {
            if(myCollection.get(i)%2==0 && myCollection.get(i)!= 0){
                tempForLastIndex = i;
            }
        }
        if(tempForLastIndex == 0){
            System.out.println("There is no even elements");
        }
        myCollection.remove(tempForLastIndex);

        System.out.println("removed the last even element: " + myCollection + " index of this element is: " + tempForLastIndex);
        System.out.println("*********************");


        min = myCollection.indexOf(Collections.min(myCollection));

        int element = myCollection.get(min+1);
        if(min != myCollection.size()){
            myCollection.remove(min+1);
        }
        System.out.println("Removed from the list myCollection the element following the first minimum: " + myCollection + ", this element was: " + element);



    }
}
