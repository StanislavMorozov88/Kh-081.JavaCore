package Lesson13.PracticalTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrTask3 {
    public static void sortByLengthInc(List<String> list){
        Collections.sort(list,Comparator.comparingInt(String::length));
        System.out.println("Sorted by increasing length" + list);
    }
    public static void sortByLengthDec(List<String> list){
        Collections.sort(list,Comparator.comparingInt(String::length).reversed());
        System.out.println("Sorted by decreasing length" + list);
    }
    public static int sortByAlphabet(String s1, String s2){
        return s1.compareTo(s2);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Dog");
        list.add("Doggy");
        list.add("Ocean");
        list.add("Do");
        list.add("Summertime");

        list.sort(PrTask3::sortByAlphabet);
        System.out.println(" Sorted by alphabet" + list);


        sortByLengthInc(list);
        sortByLengthDec(list);




    }
}
