package com.softserve.edu05;

class InfiniteLoop {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println(i);
            i--; // try comment this row
        } while (i > 0);
    }
}