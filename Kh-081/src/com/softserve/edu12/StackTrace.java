package com.softserve.edu12;

public class StackTrace {    // The getMessage and printStackTrace methods
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.err.println(e.getMessage() + "\n");
            e.printStackTrace();
        }
    }

    public static void method1() throws MyException {
        method2();
    }

    public static void method2() throws MyException {
        method3();
    }

    public static void method3() throws MyException {
        throw new MyException("Exception thrown in method3");
    }
}
