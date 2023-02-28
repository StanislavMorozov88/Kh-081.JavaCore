package pract01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TaskFourth {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How are you?");
        String answer = br.readLine();

        System.out.println("You are "+ answer);
        br.close();
    }
}
