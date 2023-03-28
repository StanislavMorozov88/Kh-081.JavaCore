package homework11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the sentence:");
        String text = scanner.nextLine();

        String[] words = text.split(" ");
        String longestWord = "";
        int longestLength = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int length = word.length();
            if (length > longestLength) {
                longestWord = word;
                longestLength = length;
            }
        }

        System.out.println(longestWord + " - " + longestLength + " letters");

        StringBuilder sb = new StringBuilder(text);
        System.out.println(sb.reverse());


    }
}

