package Lesson13.Homeworks;

import javax.imageio.stream.ImageInputStreamImpl;
import java.time.Year;

public class Hw3 {
    public static void isLeapYear (int a){
        if(Year.isLeap(a)== true){
            System.out.println("This year is leap");
        }else System.out.println("This year is not leap");
    }

    public static void main(String[] args) {
        isLeapYear(2020);
    }
}
