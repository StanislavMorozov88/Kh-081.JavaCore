package edu13.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
    String strBefore = "abc";
    String strAfter = encrypt(strBefore,3);
    System.out.println(strBefore);
    System.out.println(strAfter);

    String str1 = "def";
    String str2 = decrypt(str1,3);
    System.out.println(str2);

    //Увага! Для цієї задачі я не зрозумів, як використати лямбда вирази. Тому зробив, як зміг.

    }

    private static String encrypt(String s, int n){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] sArray = s.toCharArray();

        List<Integer> listIndex = new ArrayList<>();
        for(int i = 0; i < sArray.length; i++){
            listIndex.add(alphabet.indexOf(sArray[i]));
        }

        char[] result = new char[sArray.length];
        int index = 0;

        for (int i = 0; i < listIndex.size(); i++){
            index = listIndex.get(i) + n;
            result[i] = alphabet.charAt(index);
        }

        String str = new String(result);
        return str;
    }

    private static String decrypt(String s, int n){

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] sArray = s.toCharArray();

        List<Integer> listIndex = new ArrayList<>();
        for(int i = 0; i < sArray.length; i++){
            listIndex.add(alphabet.indexOf(sArray[i]));
        }

        char[] result = new char[sArray.length];
        int index = 0;

        for (int i = 0; i < listIndex.size(); i++){
            index = listIndex.get(i) - n;
            result[i] = alphabet.charAt(index);
        }

        String str = new String(result);
        return str;
    }
}
