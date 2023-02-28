package edu04.homework;

public class task1b {
    public static void main(String[] args) {
        int n1 = (int) (Math.random()*(20+10));
        int n2 = (int) (Math.random()*(20+10));
        int n3 = (int) (Math.random()*(20+10));

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);

          if(n1 > n2 & n1 > n3){
            System.out.println("Max: n1 = " + n1);
        } if(n2 > n1 & n2 > n3){
            System.out.println("Max: n2 = " + n2);
        } if(n3 > n1 & n3 > n2){
            System.out.println("Max: n3 = " + n3);
        } if (n1 == n2 & n2 > n3 ){
            System.out.println("Max: n1 = n2 = " + n2);
        } if (n2 == n3 & n3 > n1 ){
            System.out.println("Max: n2 = n3 = " + n3);
        } if (n1 == n3 & n3 > n2 ){
            System.out.println("Max: n1 = n3 = " + n3);
        }

          if(n1 < n2 & n1 < n3){
            System.out.println("Min: n1 = " + n1);
        } if(n2 < n1 & n2 < n3){
            System.out.println("Min: n2 = " + n2);
        } if(n3 < n1 & n3 < n2){
            System.out.println("Min: n3 = " + n3);
        } if (n1 == n2 & n2 < n3 ){
            System.out.println("Min: n1 = n2 = " + n2);
        } if (n2 == n3 & n3 < n1 ){
            System.out.println("Min: n2 = n3 = " + n3);
        } if (n1 == n3 & n3 < n2 ){
            System.out.println("Min: n1 = n3 = " + n3);
        }


    }
}
