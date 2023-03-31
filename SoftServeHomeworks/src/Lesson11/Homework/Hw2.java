package Lesson11.Homework;



public class Hw2 {
    public static String withoutBigSpaces(String str){
        return  String.join(" ", str.split("\\s{1,}"));

    }

    public static void main(String[] args) {
        System.out.println(withoutBigSpaces("I    am      learning     Java     Core"));
    }
}
