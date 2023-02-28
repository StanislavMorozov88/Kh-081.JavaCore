package pract03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WeekDay {
    private String weekday;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of the week day ");
        int input = Integer.parseInt(br.readLine());
        String weekday;

        switch (input) {
            case 1:
                weekday = "Sunday (неділя)";
                break;
            case 2:
                weekday = "Monday (понеділок)";
                break;
            case 3:
                weekday = "Tuesday (вівторок)";
                break;
            case 4:
                weekday = "Wednesday (середа)";
                break;
            case 5:
                weekday = "Thursday (четвер)";
                break;
            case 6:
                weekday = "Friday (п'ятниця)";
                break;
            case 7:
                weekday = "Saturday (субота)";
                break;
            default:
                weekday = "It is no such weekday";
        }

        System.out.println(weekday);
        br.close();
    }

}
