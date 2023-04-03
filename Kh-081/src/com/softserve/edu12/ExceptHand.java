package com.softserve.edu12;

public class ExceptHand {
    public static void main(String arg[]) {
        foo(9);
    }

    static double safeSqrt(double x) throws ArithmeticException {
        if (x < 0.0)
            throw new ArithmeticException();
        return Math.sqrt(x);
    }

    static void foo(double x) {
        double result;
        try {
            result = safeSqrt(x);
        } catch (ArithmeticException e) {
            System.out.println(e);
            result = -1;
        }
        System.out.println("result: " + result);
    }
}
