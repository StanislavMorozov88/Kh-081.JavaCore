package edu01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input first number: ");
        int n1 = Integer.parseInt(br.readLine());

        System.out.println("Input second number: ");
        int n2 = Integer.parseInt(br.readLine());

        System.out.println("Input third number: ");
        int n3 = Integer.parseInt(br.readLine());

        int average = (n1 + n2 + n3) /3;
        System.out.println("Average is " + average);

    }
}
