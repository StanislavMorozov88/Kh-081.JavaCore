package edu11.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.*;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //t1
        System.out.print("Enter a sentence of five words: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println("Longest word: " + longestWord);
        System.out.println("Number of letters: " + longestWord.length());

        //t2
        StringBuilder secondWordReversed = new StringBuilder();
        for (int i = words[1].length() - 1; i >= 0; i--) {
            secondWordReversed.append(words[1].charAt(i));
        }
        System.out.println("Second word in reverse order: " + secondWordReversed.toString());

        //t3
        //I do not have    yacht
        System.out.print("Enter a sentence with multiple spaces: ");
        sentence = scanner.nextLine();
        String[] wordsWithSpaces = sentence.split("\\s+");
        sentence = String.join(" ", wordsWithSpaces);
        System.out.println("Sentence with consecutive spaces replaced: " + sentence);

        //t4
        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        System.out.print("Enter text with US currency: ");
        String text = scanner.nextLine();
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("US currency found: " + matcher.group());
        }
    }
}