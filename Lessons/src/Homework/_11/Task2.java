package Homework._11;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;
        String[] words;
        System.out.println("Enter sentence below:");
        while (true) {
            sentence = sc.nextLine().trim();
            words = sentence.split("\\s+");
            if (words.length != 0) {
                break;
            }
            System.err.println("Write sentence ]:<");
        }
        StringBuilder builder = new StringBuilder();
//        for(String word: words){
//            builder.append(word).append(" ");
//        }
        for (int i = 0; i < words.length; i++) {
            if(i!=0 && words[i].equals("am") && words[i-1].endsWith("I")){
                //Моожна було подобаввляти інших умов на скорочення, але мені лінь
                builder.deleteCharAt(builder.length() - 1).append("'m ");
            }else {
                builder.append(words[i]).append(" ");
            }
        }
        builder.deleteCharAt(builder.length() - 1);
        String newSentence = builder.toString();
        System.out.println("Normalized sentence:");
        System.out.println(newSentence);
    }
}
/*
 * Enter a sentence that contains the words between more than one space.
 * Convert all spaces, consecutive, one.
 * For example, if we introduce the sentence "I    am      learning     Java     Core»,
 * we have to get the "I'm learning Java Core»
 */