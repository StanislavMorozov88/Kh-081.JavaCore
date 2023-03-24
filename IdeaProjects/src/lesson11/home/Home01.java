package lesson11.home;

import java.util.*;

public class Home01 {
    private static final Scanner SC = new Scanner(System.in);

    public static String[] getWordsFromConsole(){
        System.out.println("Enter five words with a space");
        return SC.nextLine().split("\\W");
    }

    private static void printSequence(String[] words) {
        System.out.println(String.join(" ", words));
    }

    public static void reverseSecond(String[] words) {
        words[1] = new StringBuilder(words[1]).reverse().toString();
    }

    public static void countLetterInSequence(String[] words) {
        int countLetters = Arrays.stream(words)
                .map(String::length)
                .reduce(0, Integer::sum);
        System.out.println("Number of letters in sequence: " + countLetters);
    }

    public static void findLongestWord(String[] words) {
        Arrays.stream(words)
                .max(Comparator.comparing(String::length)).ifPresent(s-> System.out.println("Longest word is: " + s));
    }

    public static void main(String[] args) {
        String[]words = getWordsFromConsole();
        printSequence(words);
        findLongestWord(words);
        countLetterInSequence(words);
        reverseSecond(words);
        printSequence(words);
    }
}
