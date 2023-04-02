package lesson13.practical;

import java.util.ArrayList;
import java.util.List;

public class StringSorting {
    public static int sortingByLengthAsc(String str1, String str2){
        return Integer.compare(str1.length(),str2.length());
    }

    public static int sortingByLengthDesc(String str1,String str2){
        return Integer.compare(str2.length(),str1.length());
    }
    public static int sortingAlphabeticallyDesc(String str1, String str2){
        return str2.compareTo(str1);
    }

    public static void main(String[] args) {
        List<String>strings = new ArrayList<>(List.of("hello","hi","goodBye","what a wonderful day"));
        System.out.println("Original list: " + strings);


        strings.sort(StringSorting::sortingByLengthAsc);
        System.out.println("List sorted by length in ascending order: " + strings);

        strings.sort(StringSorting::sortingByLengthDesc);
        System.out.println("List sorted by length in descending order: " + strings);

        strings.sort(StringSorting::sortingAlphabeticallyDesc);
        System.out.println("List sorted Alphabetically in descending order: " + strings);

    }
}
