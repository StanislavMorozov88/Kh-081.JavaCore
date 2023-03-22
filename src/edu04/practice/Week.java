package edu04.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Week {
    private static final Scanner SC = new Scanner(System.in);
    enum Day {
        MONDAY("Monday", "Понеділок"),
        TUESDAY("Tuesday", "Вівторок"),
        WEDNESDAY("Wednesday", "Середа"),
        THURSDAY("Thursday", "Четвер"),
        FRIDAY("Friday", "П'ятниця"),
        SATURDAY("Saturday", "Субота"),
        SUNDAY("Sunday", "Неділя");

        private final String EN;
        private final String UA;

        Day(String en, String ua) {
            EN = en;
            UA = ua;
        }

        public String getEn() {
            return EN;
        }

        public String getUa() {
            return UA;
        }

        public String toString() {
            return "Day: " + this.getEn() + " / " + this.getUa();
        }
    }
    private static int readNumber() {
        while (true) {
            try {
                return SC.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("It's not a number");
                SC.nextLine();
            }
        }
    }
    public static void main(String[] args) {
        boolean isValidDay = true;
        while (isValidDay) {
            System.out.println("Enter number from 1 to 7: ");
            int number = readNumber();
            switch (number) {
                case 1 -> System.out.println(Day.MONDAY);
                case 2 -> System.out.println(Day.TUESDAY);
                case 3 -> System.out.println(Day.WEDNESDAY);
                case 4 -> System.out.println(Day.THURSDAY);
                case 5 -> System.out.println(Day.FRIDAY);
                case 6 -> System.out.println(Day.SATURDAY);
                case 7 -> System.out.println(Day.SUNDAY);
                default -> {
                    isValidDay = false;
                    System.out.println("It's not a valid number");
                    System.out.println("Goodbye");
                }
            }
        }
    }
}