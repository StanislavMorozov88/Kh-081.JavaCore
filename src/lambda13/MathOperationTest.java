package lambda13;

public class MathOperationTest {
    public static void main(String[] args) {
        MathOperationTest test = new MathOperationTest();

        MathOperation addition = (int a, int b) -> a + b;  //with type declaration

        MathOperation substraction = (a, b) -> a - b; //without type declaration

        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        }; //with return statement with curly braces

        MathOperation division = (int a, int b) -> a / b; //without return statement and without curly braces

        System.out.println("10 + 5 = " + test.operate(10, 5, addition));
        System.out.println("10 - 5 = " + test.operate(10, 5, substraction));
        System.out.println("10 x 5 = " + test.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + test.operate(10, 5, division));
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
