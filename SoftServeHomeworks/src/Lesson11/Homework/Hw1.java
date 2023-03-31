package Lesson11.Homework;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw1 implements Comparator<String> {
        static Scanner sc = new Scanner(System.in);

        @Override
        public int compare(String o1, String o2) {
                return o2.length()-o1.length();
        }
        public static String theLongestWord(List<String> strs){
                List<String> strs2 = new ArrayList<>(strs);
                Collections.sort(strs2,new Hw1());
                return strs2.get(0);
        }
        public static StringBuilder reverseSecondWord(List<String> strs){
                StringBuilder rev = new StringBuilder(strs.get(1));
                return rev.reverse();
        }
        public static boolean checker (String str){
                Pattern p = Pattern.compile("\\w{1,}\\s\\w{1,}\\s\\w{1,}\\s\\w{1,}\\s\\w{1,}");
                Matcher m = p.matcher(str);
                return m.matches();
        }
        public static String enterSentence (){
                String sentence = sc.nextLine();
                checker(sentence);
                while (!checker(sentence)){
                        System.out.println("You entered incorrect sentence, pls retry");
                        sentence = sc.nextLine();
                }
                System.out.println("You entered correct sentence");
                return sentence;
        }


        public static void main(String[] args) {
                System.out.println("Enter the sentence with 5 words: ");
                String str = enterSentence();
                String first = str.substring(0, str.indexOf(" "));
                String second = str.substring(first.length() + 1, str.indexOf(" ", first.length() + 1));
                String third = str.substring(first.length() + 1 + second.length() + 1, str.indexOf(" ", first.length() + 1 + second.length() + 1));
                String fourth = str.substring(first.length() + 1 + second.length() + 1 + third.length() + 1, str.indexOf(" ", first.length() + 1 + second.length() + 1 + third.length() + 1));
                String fifth = str.substring(str.lastIndexOf(" ") + 1);


                List<String> strs = new ArrayList<>();
                strs.add(first);
                strs.add(second);
                strs.add(third);
                strs.add(fourth);
                strs.add(fifth);


                System.out.println("The longest word is: " +theLongestWord(strs));
                System.out.println("The length of the longest word is: " + theLongestWord(strs).length());
                System.out.println(strs);
                System.out.println("second word in reverse order: " + reverseSecondWord(strs));
        }
}
