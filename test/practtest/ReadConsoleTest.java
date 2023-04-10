package practtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**У тестах використовуємо ByteArrayInputStream, щоб передати рядок "......" у System.setIn.
 * Потім викликаємо readIntFromConsole і очікуємо, що він верне вміст але відповідного типу.
 * Додатнє число в першому, від'ємне в другому, дабл в третьому тесті і т.д.
 * Метод assertEquals перевіряє, що фактичний результат сповпадає з очікуваним.
 * Якщо користувач вводить що-небудь інше окрім цілого, то метод scanner.nextInt() викликає виключення InputMismatchException.
 */
class ReadConsoleTest {

    @Test
    void readNumberFromConsole() {
        String input = "30";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        int result = ReadConsole.readNumberFromConsole();
        assertEquals(30, result);
    }
    @Test
    public void testReadIntFromConsoleNegativeNumber() {
        String input = "-5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(-5, ReadConsole.readNumberFromConsole());
    }


    @Test
    public void testReadIntFromConsoleDecimalNumber() {
        String input = "3.14";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Assertions.assertThrows(InputMismatchException.class, () -> {
            ReadConsole.readNumberFromConsole();
        });
    }
    //зверніть увагу на параметри анотації
    //    @Test(expected = InputMismatchException.class)//у мене так не працювало, тому переробила
//    public void testReadIntFromConsoleEmptyInput() {
//        String input = "\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        ReadConsole.readNumberFromConsole();
//    }
    @Test
    public void testReadIntFromConsoleEmptyInput() {
        String input = "";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Assertions.assertThrows(NoSuchElementException.class, ReadConsole::readNumberFromConsole);
    }

    @Test
    public void testReadIntFromConsoleInvalidInput() {
        String input = "some text";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Assertions.assertThrows(InputMismatchException.class, () -> {
            ReadConsole.readNumberFromConsole();
        });
    }
}