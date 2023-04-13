package com.softserve.edu16.practical;

//        2.	Prepare a file with text:
//        1) find and output to the console all words starting with a vowel.
//        2) find and output to the console all words for which the last letter of one word matches the first letter of the next word.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        String filename = "mytext.txt";
        String[] words = readWordsFromFile(filename);

        // Find and output all words starting with a vowel
        List<String> wordsStartingWithVowel = new ArrayList<>();
        for (String word : words) {
            if (word.matches("(?i)[aeiouy].*")) {
                wordsStartingWithVowel.add(word);
            }
        }
        System.out.println("Words starting with a vowel: " + wordsStartingWithVowel);

        // Find and output all words where the last letter of one word matches the first letter of the next word
        List<String> wordsMatchingFirstAndLastLetter = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            if (word1.charAt(word1.length() - 1) == word2.charAt(0)) {
                wordsMatchingFirstAndLastLetter.add(word1);
                wordsMatchingFirstAndLastLetter.add(word2);
            }
        }
        System.out.println("Words where last letter of one word matches first letter of next word: " + wordsMatchingFirstAndLastLetter);
    }

    private static String[] readWordsFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                sb.append(" ");
            }
            return sb.toString().split("\\s+");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return new String[0];
        }
    }
}


