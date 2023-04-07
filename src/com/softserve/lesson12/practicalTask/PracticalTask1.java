package com.softserve.lesson12.practicalTask;

public class PracticalTask1 {
    public static void main(String[] args) {
        try{
            System.out.println(squareRectangle(2, 5));
            System.out.println(squareRectangle(3, 6));
            System.out.println(squareRectangle(4, 7));
            System.out.println(squareRectangle(5, 8));
            System.out.println(squareRectangle(-2, -5));
            System.out.println(squareRectangle(-2, 5));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    private static int squareRectangle(int i, int j){
        if(i < 0 || j < 0) {
            throw new IllegalArgumentException("Parameters cant be less than zero");
        }
        return i * j;

    }
}
