package homework04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Month {//better named class MonthDays
    public static void main(String[] args) throws Exception {

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int n = 12;//краще замість отакого робити перевірку
        //в тому випадку у тебе виведеться повідомлення що невалідний номер місяця

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter month number (1-12): ");
        int monthNumber = Integer.parseInt(br.readLine());


//        if (monthNumber <= n) {
//            System.out.println(monthNumber + " month has " + days[monthNumber - 1] + " days");
//        }
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid month number.");
        } else   {
            System.out.println(monthNumber + " month has " + days[monthNumber - 1] + " days");
       }
    }
}
