package lesson12.home;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Home01 {
    /*Все коменти потім приберу ;)
    я чогось думала, що ArithmeticException викинеться автоматом, як і з int-ами.
     */
    public static double div(double a, double b) {
        if (b == 0)throw new ArithmeticException("Division by zero");
        return a / b;
    }
/*Оля, привіт. Вибачай, що залишаю комент.
Зтикнулась із такою проблемою, що ділення двох double values не викидуэ зовсім ніякого exception. Ця дія дає результат Infinity
Ось коли int / на 0, то ArithmeticException є. А коли double - зігалом ніякого.(а у нас по умові double)
Як бути в таких випадках? Як це відловлювати, виходити тільки перевіркою if у методі? Я закоментую старий код, глянеш потім.
Зроблю новий з if, бо інакше catch ArithmeticException не працюэ загалом. Присвоює результату Infinity ((
 */

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter divisible: ");
            double divisible = scanner.nextDouble();
            System.out.println("Enter divisor: ");
            double divisor = scanner.nextDouble();
            System.out.println("Division result is: " + div(divisible, divisor));
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Only double values are allowed");
        }
    }
}
