package pract01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TaskThird {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input a:");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Input b:");
        int b = Integer.parseInt(br.readLine());

        int sum = a + b;
        System.out.println("Sum is " + sum);

        int diff = a - b;
        System.out.println("Difference is " + diff);

        int multi = a * b;
        System.out.println("Multiplication is " + multi);

        int div = a / b;
        System.out.println("Division is " + div);
        br.close();

    }
}
