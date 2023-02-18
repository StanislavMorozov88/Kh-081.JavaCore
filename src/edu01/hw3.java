package edu01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input cost#1");
        double c1 = Integer.parseInt(br.readLine());
        System.out.println("Input time#1");
        double t1 = Integer.parseInt(br.readLine());
        double p1 = t1 * c1;
        System.out.println("The first call cost = " +p1);

        System.out.println("Input cost#2");
        double c2 = Integer.parseInt(br.readLine());
        System.out.println("Input time#2");
        double t2 = Integer.parseInt(br.readLine());
        double p2 = t2 * c2;
        System.out.println("The second call cost = " +p2);

        System.out.println("Input cost#3");
        double c3 = Integer.parseInt(br.readLine());
        System.out.println("Input time#3");
        double t3 = Integer.parseInt(br.readLine());
        double p3 = t3 * c3;
        System.out.println("The first call cost = " +p3);

        double total = p1 + p2 + p3;
        System.out.println("Total cost = " + total);

    }
}
