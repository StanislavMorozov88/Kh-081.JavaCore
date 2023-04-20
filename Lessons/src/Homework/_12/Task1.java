package Homework._12;


public class Task1 {
    /**
     * <p>Create method <b>div()</b>, which calculates the dividing of two double numbers.
     * In main method input 2 double numbers and call this method.<br>
     * <b>Catch all exceptions.</b></p>
     */
    public static void main(String[] args) {
        //Мееее, було лінь писати тест, ловіть трай-кетч:

        //Division by 0
        try {
            System.out.println(div(1, 0));
        }catch (NumberFormatException | ArithmeticException e){
            System.err.println(e.getMessage());
        }

        //Non-numeric numerator input
        try {
            System.out.println(div(Double.NaN, 1));
        }catch (NumberFormatException | ArithmeticException e){
            System.err.println(e.getMessage());
        }

        //Non-numeric denominator input
        try {
            System.out.println(div(1, Double.NaN));
        }catch (NumberFormatException | ArithmeticException e){
            System.err.println(e.getMessage());
        }

        //Infinity as numerical and denominator
        try {
            System.out.println(div(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY));
        }catch (NumberFormatException | ArithmeticException e){
            System.err.println(e.getMessage());
        }

        //Infinity as the denominator
        try {
            System.out.println(div(1, Double.POSITIVE_INFINITY));
        }catch (NumberFormatException | ArithmeticException e){
            System.err.println(e.getMessage());
        }

        //Enter infinity as numerical
        try {
            System.out.println(div(Double.POSITIVE_INFINITY, 1));
        }catch (NumberFormatException | ArithmeticException e){
            System.err.println(e.getMessage());
        }

        //Enter infinity as denominator
        try {
            System.out.println(div(Double.NEGATIVE_INFINITY, 1));
        }catch (NumberFormatException | ArithmeticException e){
            System.err.println(e.getMessage());
        }

    }

    public static double div(double n1, double n2) throws ArithmeticException, NumberFormatException{
        if (Double.isNaN(n1)){
            throw new NumberFormatException("Numerator is not a numeric value");
        } else if (Double.isNaN(n2)){
            throw new NumberFormatException("The denominator is not a numeric value");
        }

        if (n2 == 0){
            throw new ArithmeticException("Division by zero is not supported");
        }else if (Double.isInfinite(n1) && Double.isInfinite(n2)){
            throw new ArithmeticException("The result of actions such as ∞/∞ or 0/0 is uncertain");
        }else if (Double.isInfinite(n2)){
            return 0;
        }else if (Double.isInfinite(n1)){
            if (n1 < 0){
                return Double.NEGATIVE_INFINITY;
            } else {
                return Double.POSITIVE_INFINITY;
            }
        }
        return n1/n2;
    }
}
