package lesson14.pt;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Prepare mytext.txt file with a lot of text inside.
 * Read context from file into array of strings.
 * Each array item contains one line from file.
 * Complete next tasks:
 * 1) count and write the number of symbols in every line.
 * 2) find the longest and the shortest line.
 * 3) find and write only that lines, which consist of word «var»
 */

public class Main {
    public static void main(String[] args) {
        String fileName = "mytext.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String str;
            String[] strArr = null;
            System.out.println("Read data from file" + fileName);
            while ((str = bufferedReader.readLine()) != null) {
                //Each array item contains one line
                strArr = str.split("\\. ");
            }
            // count and write the number of symbols in every line.
            Arrays.stream(strArr).forEach(s -> System.out.println("\"" + s + "\"; Numbers of symbols - " + (s.length() + 1)));
            //find the longest and the shortest line.
            String longest = Arrays.stream(strArr).max(Comparator.comparing(String::length)).get();
            String shortest = Arrays.stream(strArr).min(Comparator.comparing(String::length)).get();
            System.out.println("\nThe longest string: " + longest + "\nThe shortest string: " + shortest + "\n");
            // find and write only that lines, which consist of word «var»
            Arrays.stream(strArr).filter(s1 -> s1.contains(" var ")).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("File Read/Write Error: " + fileName);
        }
    }
}
