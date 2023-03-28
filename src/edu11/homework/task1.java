package edu11.homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in the console sentence of five words.");
        String input = scan.nextLine();
        scan.close();
        System.out.println("Input: " + input);

        String[] words = input.split("(\\,|\\!|\\?|\\.)?(\\s|\\?|\\.)");

        System.out.println("-------------------");
        for (String word : words){
            System.out.println(word);
        }


        int max = words[0].length();
        int index = 0;
        for(int i = 0; i < words.length; i++){
            if(words[i].length() > max){
                max = words[i].length();
                index = i;
            }
        }
        System.out.println("-------------------");
        System.out.println("The longest word in the sentence" + ": " + words[index]);
        System.out.println("The number of its letters: " + max);

        StringBuffer strBuffer = new StringBuffer(words[1]);
        System.out.println("The second word in reverse order: " + strBuffer.reverse());


    }
}
