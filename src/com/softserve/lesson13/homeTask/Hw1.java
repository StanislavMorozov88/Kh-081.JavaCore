package com.softserve.lesson13.homeTask;

public class Hw1 {
    private static String encrypt(String s, int n){
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            char encryptedChar = (char) (c + n);
            sb.append(encryptedChar);
        }
        return sb.toString();
    }

    public static String decrypt(String s, int n){
        return encrypt(s, n*(-1));
    }

    public static void main(String[] args) {
        System.out.println(encrypt("abcdz", 1));
        System.out.println(decrypt("bcde{", 1));
    }
}
