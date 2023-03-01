package pract04;

import java.util.Arrays;

public class NewArray {
    public static void main(String[] args) {

        int[] newArray = {10, -58, 33, -56, 17, -89, 256, 1, 65, 31};
        int i = 0;
        int[] newArray1 = new int[10];
        newArray1[0] = 10;
        newArray1[1] = -58;
        newArray1[2] = 33;
        newArray1[3] = -56;
        newArray1[4] = 17;
        newArray1[5] = -89;
        newArray1[6] = 256;
        newArray1[7] = 1;
        newArray1[8] = 65;
        newArray1[9] = 31;

        int max = newArray[0];
        while (i < newArray.length) {
            if (newArray[i] > max) {
                max = newArray[i];
            }
            i++;
        }
        System.out.println(Arrays.toString(newArray1));
        System.out.println("Maximum = " + max);

        int sum = 0;
        for (i = 0; i < newArray.length; i++) {
            if (newArray[i] > 0) {
                sum = sum + newArray[i];
            }

        }
        System.out.println("Sum = " + sum);

        int amountNeg = 0;
        for (i = 0; i < newArray.length; i++) {
            if (newArray[i] < 0) {
                amountNeg++;
            }
        }
        System.out.println("Amount of negative numbers is " + amountNeg);

        int amountPos = 0;
        for (i = 0; i < newArray.length; i++) {
            if (newArray[i] > 0) {
                amountPos++;
            }
        }
        System.out.println("Amount of positive numbers is " + amountPos);


    }
}
