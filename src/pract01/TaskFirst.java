package pract01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TaskFirst {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter str1");
        String str1 = br.readLine();

        System.out.println("enter str2");
        String str2 = br.readLine();

        System.out.println("enter str3");
        String str3 = br.readLine();

        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str1);

        br.close();
    }
}
