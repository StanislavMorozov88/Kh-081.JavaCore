package lesson16.practical;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Task01 {
    public static void main(String[] args) {
        File file = new File("D:\\Лена\\SoftServe\\Kh-081.JavaCore\\IdeaProjects\\src\\lesson16\\practical\\myText.txt");
        String[] arrayFromFile = readFileToArray(file);
        printNumberOfSymbolsInLines(arrayFromFile);

        Optional<String> longestLine = getLongestLine(arrayFromFile);
        longestLine.ifPresentOrElse(s -> System.out.println("Longest line " + longestLine.get())
        ,()-> System.out.println("Array is empty or null "));

        String shortest = Arrays.stream(arrayFromFile)
                .min(Comparator.comparingInt(String::length))
                .orElse("empty");
        System.out.println(shortest);

        String pattern = "var";
        Arrays.stream(arrayFromFile)
                .filter(lines->lines.contains(pattern))
                .findAny().ifPresentOrElse(System.out::println,()-> System.out.println("No lines which consist of words '" + pattern + "'"));




    }

    public static Optional<String> getLongestLine(String[] arrayFromFile) {
        if (arrayFromFile == null)return Optional.empty();
        return Arrays.stream(arrayFromFile)
                .max(Comparator.comparing(String::length));
    }

    private static void printNumberOfSymbolsInLines(String[] arrayFromFile) {
        IntStream.range(0, arrayFromFile.length)
                .forEach(i-> System.out.println("Number of symbols in " + (i+1) + " line: " + arrayFromFile[i].length()));
    }

    public static String[] readFileToArray(File file) {
        List<String>strings = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file));){
            String line;
            while ((line = br.readLine())!=null){
                strings.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings.toArray(new String[0]);
    }
}
