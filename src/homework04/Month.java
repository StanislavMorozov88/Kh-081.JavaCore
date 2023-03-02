package homework04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Month {
    public static void main(String[] args) throws Exception {

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int n = 12;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter month number (1-12): ");
        int monthNumber = Integer.parseInt(br.readLine());


        if (monthNumber <= n) {
            System.out.println(monthNumber + " month has " + days[monthNumber - 1] + " days");
        }

    }
}
