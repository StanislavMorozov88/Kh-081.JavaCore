package Homework._11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;
        String[] words;
        while (true){
            sentence = sc.nextLine().trim();
            words = sentence.split("[,.\";!?\\s]+");
            if (words.length == 5){
                break;
            }
            System.err.println("Try again! (sentence must contain exact five words)");
        }
        String longestWord = Arrays.stream(words).max(Comparator.comparingInt(String::length)).get();
        System.out.println("The longest word is \"\033[0;36m" + longestWord + "\033[0m\" wich contains \033[0;36m" + longestWord.length() + "\033[0m letters;");
        StringBuilder builder = new StringBuilder(words[1]);
        String reversedWord = builder.reverse().toString();
        System.out.println("Second word in reverse order: \033[0;36m" + reversedWord + "\033[0m");
    }
}
/*
* Enter in the console sentence of five words.
* display the longest word in the sentence
* determine the number of its letters
* bring the second word in reverse order
*/