package lesson13.home;

import java.util.stream.Collectors;

public class Task01 {

    public static String encrypt(String s, int n) {
        return s.chars()
                .filter(character -> character != ' ')
                .mapToObj(character -> {
                    if (Character.isUpperCase(character)) {
                        return (char) ((character + n - 'A') % 26 + 'A');
                    } else return (char) ((character + n - 'a') % 26 + 'a');
                })
                .map(String::valueOf)
                .collect(Collectors.joining(""));
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, 26 - (n % 26));
    }

    public static void main(String[] args) {
        String original = "Ukraine";
        StringConverter encryptString = Task01::encrypt;
        StringConverter decryptString = Task01::decrypt;
        String encrypt = encryptString.convertString(original, 3);
        String decrypt = decryptString.convertString(encrypt, 3);
        System.out.println("Original string: " + original);
        System.out.println("String after Caesar cipher " + encrypt);
        System.out.println("String after decryption to the original " + decrypt);
    }
}
interface StringConverter {
    String convertString(String str, int n);
}
