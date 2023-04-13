package com.softserve.edu16.practical;
//Prepare mytext.txt file with a lot of text inside.
//        Read context from file into array of strings.
//        Each array item contains one line from file.
//        Complete next tasks:
//        1) count and write the number of symbols in every line.
//        2) find the longest and the shortest line.
//        3) find and write only that lines, which consist of word «Some»

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        String filename = "mytext.txt";
        String[] lines = readLinesFromFile(filename);

        // Count and write the number of symbols in every line
        for (String line : lines) {
            int numSymbols = line.length();
            System.out.println("Line \"" + line + "\" has " + numSymbols + " symbols.");
        }

        // Find the longest and the shortest line
        String shortestLine = lines[0];
        String longestLine = lines[0];
        for (String line : lines) {
            if (line.length() < shortestLine.length()) {
                shortestLine = line;
            }
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }
        System.out.println("Shortest line: \"" + shortestLine + "\"");
        System.out.println("Longest line: \"" + longestLine + "\"");

        // Find and write only the lines that consist of word "Some"
        System.out.println("Lines that consist of the word \"Some\":");
        for (String line : lines) {
            if (line.contains("Some")) {
                System.out.println(line);
            }
        }
    }

    private static String[] readLinesFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }
            return sb.toString().split(System.lineSeparator());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return new String[0];
        }
    }
}
