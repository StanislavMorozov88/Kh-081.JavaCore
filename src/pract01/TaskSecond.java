package pract01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TaskSecond {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input first number:");
        int firstnumber = Integer.parseInt(br.readLine());
        System.out.println("Input second number:");
        int secondnumber = Integer.parseInt(br.readLine());
        System.out.println("Input third number:");
        int thirddnumber = Integer.parseInt(br.readLine());

        int[] numbers = {firstnumber, secondnumber, thirddnumber};
        float sum = 0;

        for(int num:numbers)
            sum += num;

        float average = sum / numbers.length;

        System.out.println("Average is "+average);
        br.close();

    }
}
