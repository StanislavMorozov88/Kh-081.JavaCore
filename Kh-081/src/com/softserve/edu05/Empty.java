package com.softserve.edu05;

class Empty {
    public static void main(String[] args) throws java.lang.Exception {
        int i = 10, j = 20;
        do {
          System.out.println("Decremented j");// try this uncomment
           // ;// and this comment
        } while (i <= --j);
        System.out.println("Sum is " + (i + j)); // i = 10 ; j = 9
    }
}