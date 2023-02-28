package edu04.homework;

public class task1a {
    public static void main(String[] args) {
        float n1 = (float) Math.random()*(20+10);
        float n2 = (float) Math.random()*(20+10);
        float n3 = (float) Math.random()*(20+10);
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);

          if (n1 > -5 & n1 < 5){
            System.out.println("n1 = " + n1 + " is belong to range [-5, 5]");
        } if (n2 > -5 & n2 < 5){
            System.out.println("n2 = " + n2 + " is belong to range [-5, 5]");
        } if (n3 > -5 & n3 < 5){
            System.out.println("n3 = " + n3 + " is belong to range [-5, 5]");
        }
    }
}
