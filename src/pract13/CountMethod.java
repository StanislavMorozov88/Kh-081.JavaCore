package pract13;

import java.util.function.IntPredicate;

public class CountMethod {
    public static int count(Integer[] arr, IntPredicate predicate) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }

}
