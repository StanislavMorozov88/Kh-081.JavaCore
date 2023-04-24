package Lesson16.PracticalTasks;

import java.io.*;
import java.util.Arrays;


public class PrTask1 {
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

    public static void main(String[] args) throws FileNotFoundException {
        String src = "mytext.txt";
        File file = new File(src);
        String text = "Sam's lamb\n" +
                "Sam's lamb eats jam,\n" +
                "Porridge, ham\n" +
                "And cheese with ease.";
        char[] chars = text.toCharArray();
        int i = 1;

        try (FileWriter writer = new FileWriter(src);
             BufferedWriter bw = new BufferedWriter(writer)) {
            bw.write(chars);
        } catch (IOException e) {
            e.getMessage();
        }


        String[] strings = readLinesFromFile(src);
        String shortest = strings[0];
        String longest = strings[0];
        System.out.println(Arrays.toString(strings));
        for (String line : strings) {
            System.out.println("Line " + i + " has " + line.length() + " symbols");
            i++;
            if (shortest.length() > line.length()) {
                shortest = line;
            }
            if (longest.length() < line.length()) {
                longest = line;
            }
        }
        System.out.println("Shortest line is: " + shortest + "\n" + " And longest line is " + longest);

        for (String line : strings) {
            if (line.contains("jam")) {
                System.out.println(line);
            }
        }
    }
}