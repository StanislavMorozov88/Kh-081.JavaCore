package PracticalTask._4.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        DaysOfWeek day = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть номер дня:");
        int n = sc.nextInt();
        sc.close();
        switch (n){
            case 1 -> {
                day = DaysOfWeek.MONDAY;
            }case 2 -> {
                day = DaysOfWeek.TUESDAY;
            }case 3 -> {
                day = DaysOfWeek.WEDNESDAY;
            }case 4 -> {
                day = DaysOfWeek.THURSDAY;
            }case 5 -> {
                day = DaysOfWeek.FRIDAY;
            }case 6 -> {
                day = DaysOfWeek.SATURDAY;
            }case 7 -> {
                day = DaysOfWeek.SUNDAY;
            }default -> {
                System.err.println("Unexpected value: " + n);
            }
        }

        if (n>0 && n<=7) {
            System.out.println("Ваш день: \nУкраїнською - \""+ day.getUa() +"\"");
            System.out.println("Англійською - \""+ day.getEn() +"\"");
        }

    }
}
