package Lesson13.Homeworks;
public class Hw1 {
    public static String encrypt(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (c + n);
                if (Character.isUpperCase(c) && shifted > 'Z' || Character.isLowerCase(c) && shifted > 'z') {
                    shifted = (char) (shifted - 26);
                }
                result.append(shifted);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static String decrypt(String s, int a){
        return encrypt(s,a*(-1));
    }

    public static void main(String[] args) {
        System.out.println(encrypt("abcd",1));
        System.out.println(decrypt("bcde",1));

    }

}
