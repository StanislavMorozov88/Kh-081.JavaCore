package com.softserve.lesson11.homeTask;


import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        System.out.println("Enter string of 5 words: ");
        String[] arr = enterString().split(" ");
        String longestWord = arr[0];
        for(String s : arr){
            if (s.length() > longestWord.length()){
                longestWord = s;
            }
        }
        System.out.println(longestWord + " contains " + longestWord.length() + " letters");
        System.out.println("Second word in the reverse order is: " + arr[arr.length - 2]);
    }

    private static String enterString(){
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        sc.close();
        return result;
    }

}
