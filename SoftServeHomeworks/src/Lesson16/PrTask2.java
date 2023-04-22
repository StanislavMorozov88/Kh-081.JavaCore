package Lesson16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrTask2 {
    public static void main(String[] args) {
        String src = "mytext.txt";
        StringBuilder sb = new StringBuilder();
        String[] strings = readLinesFromFile(src);
        List<String> wordsStartingWithVowel = new ArrayList<>();
        for (String word : strings){
            if (word.matches("(?i)[aeiouy].*")) {
                wordsStartingWithVowel.add(word);
            }
        }
        System.out.println("Words starting with a vowel: " + wordsStartingWithVowel);

        List<String> wordsMatchingFirstAndLastLetter = new ArrayList<>();
        for (int i = 0; i < strings.length - 1; i++) {
            String word1 = strings[i];
            String word2 = strings[i + 1];
            if (word1.charAt(word1.length() - 1) == word2.charAt(0)) {
                wordsMatchingFirstAndLastLetter.add(word1);
                wordsMatchingFirstAndLastLetter.add(word2);
            }
        }
        System.out.println("Words where last letter of one word matches first letter of next word: " + wordsMatchingFirstAndLastLetter);



    }
    public static String[] readLinesFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int x;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }
            return sb.toString().split(System.lineSeparator());
        } catch (IOException e) {
            e.getMessage();
        }
        return new String[0];
    }
}
