package com.softserve.edu04;

enum Season {
    WINTER, SPRING, SUMMER, AUTUMN
}

public class Main {
    public static void main(String[] args) {
        Season season;
        String month = "Deсember";
        season = switch (month) {
            case "Deсember", "January", "February" -> Season.WINTER;
            case "Marth", "April", "May" -> Season.SPRING;
            case "June", "Jule", "August" -> Season.SUMMER;
            case "September", "October", "November" -> Season.AUTUMN;
            default -> Season.AUTUMN;
        };
        System.out.print(season);
    }
}
