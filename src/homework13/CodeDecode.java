package homework13;

import java.util.Scanner;

public class CodeDecode {
    public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String s, int n) {
        s = s.toLowerCase();
        String text = "";
        for (int i = 0; i < s.length(); i++) {
            int charPosition = alphabet.indexOf(s.charAt(i));
            int nValue = (n + charPosition) % 26;
            char replaceValue = alphabet.charAt(nValue);
            text = text + replaceValue;
        }
        return text;
    }

    public static String decrypt(String s1, int n1) {
        s1 = s1.toLowerCase();
        String text1 = "";
        for (int i1 = 0; i1 < s1.length(); i1++) {
            int charPosition1 = alphabet.indexOf(s1.charAt(i1));
            int nValue1 = (charPosition1 - n1) % 26;
            if (n1 < 0) {
                nValue1 = alphabet.length() + nValue1;
            }
            char replaceValue1 = alphabet.charAt(nValue1);
            text1 = text1 + replaceValue1;
        }
        return text1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        int key = 0;
        System.out.println("Enter the String for encription: ");
        s = sc.next();

        System.out.println("Enter n: ");
        key = sc.nextInt();
        System.out.println("Encrypted text: " + encrypt(s, key));

        String s1 = new String();
        int key1 = 0;
        System.out.print("Enter the String for decription:");
        s1 = sc.next();

        System.out.println("Enter n1: ");
        key1 = sc.nextInt();
        System.out.println("Encrypted text: " + decrypt(s1, key1));

    }
}
