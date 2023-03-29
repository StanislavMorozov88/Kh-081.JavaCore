package lesson12.home;

import java.util.Scanner;

public class Home02 {
    static final Scanner SC = new Scanner(System.in);

    public static int readNumber(int lowerBound, int upperBound) throws RangeException {
        checkRange(lowerBound, upperBound);
        System.out.println("Enter number: ");
        return validateNumber(getIntFromConsole(), lowerBound, upperBound);
    }

    private static void checkRange(int lower, int upper) throws RangeException {
        if (lower >= upper) throw new RangeException("Incorrect Range: lower bound is greater than or equal to upper");
    }

    private static int validateNumber(int number, int lowerBound, int upperBound) throws RangeException {
        if (number < lowerBound || number > upperBound) {
            throw new RangeException("Number is not in a range " + getFormattedRange(lowerBound, upperBound));
        }
        return number;
    }

    private static int getIntFromConsole() throws RangeException {
        try {
            return Integer.parseInt(SC.next());
        } catch (NumberFormatException e) {
            throw new RangeException("Not integer ");
        }
    }

    private static String getFormattedRange(int lowerBound, int upperBound) {
        return String.format("[%d, %d]%n", lowerBound, upperBound);
    }

    static class RangeException extends Exception {
        public RangeException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        int count = 1;
        int lowerBound = 1;
        int upperBound = 100;
        do {
            try {
                int number = readNumber(lowerBound, upperBound);
                System.out.println("Number " + number + " is in a range " + getFormattedRange(lowerBound, upperBound));
            } catch (RangeException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        } while (count++ < 10);
    }
}
