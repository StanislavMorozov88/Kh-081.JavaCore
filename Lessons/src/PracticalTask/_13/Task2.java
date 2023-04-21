package PracticalTask._13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    /**
     *Write a method for sorting list of Strings using Java 8
     */
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        Random random = new Random();

        //Just filled in some symbols ASCII from the table for fun
        for (int i = 0; i < 20; i++){
            l.add((char) random.nextInt(65, 122) + "-" + i);
        }

        System.out.println(l);

        //Use sort method
        sortList(l);
        System.out.println(l);
    }

    public static void sortList(List<String> list){
        list.sort(String::compareTo);
    }
}
