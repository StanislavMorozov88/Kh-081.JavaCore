package lesson10.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1) Enter in console sentence of five words.
 * display the longest word in the sentence
 * determine the number of its letters
 * bring the second word in reverse order
 * 2) Enter a sentence that contains the words between more than one space.
 * Convert all spaces, consecutive, one.
 * For example, if we introduce the sentence "I    am      learning     Java     Core»,
 * we have to get the "I'm learning Java Core»
 * 3) Implement a pattern for US currency: the first symbol "$",
 * then any number of digits, dot and two digits after the dot.
 * Enter the text from the console that contains several occurrences of US currency.
 * Display all occurrences on the screen
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ex 1
        System.out.println("Enter the sentence:");
        String str1 = sc.nextLine();
        String[] words = str1.split(" ");
        int maxL = 0;
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxL) {
                maxL = words[i].length();
                longestWord = words[i];
            }
        }
        String reverse = new StringBuffer(longestWord).reverse().toString();
        System.out.println("The longest word: " + longestWord + "; Count of letters: " + maxL);
        System.out.println("Reversed the longest word: " + reverse);
        System.out.println("---------------------------------");

        //ex 2
        System.out.println("Enter the sentence:");
        String str = sc.nextLine();
        String r = "\\s+";
        System.out.println(str.replaceAll(r, " "));
        System.out.println("---------------------------------");

        //ex 3
        System.out.println("Enter text with US currency:");
        String currency = sc.nextLine();
        String pattern = "\\$\\d+\\.\\d{2}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(currency);
        while (m.find()){
            System.out.println(m.group());
        }
        m.reset();
    }
}
