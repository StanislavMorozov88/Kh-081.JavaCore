package edu01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hello. String1?");
        String s1 = br.readLine();

        System.out.println("Else, String2?");
        String s2 = br.readLine();

        System.out.println("Else, String3?");
        String s3 = br.readLine();

        System.out.println("Output text: ");
        System.out.println(s3);
        System.out.println(s2);
        System.out.println(s1);

    }
}
