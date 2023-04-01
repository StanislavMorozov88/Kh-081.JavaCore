package edu05.homework.integer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerTest {

    @Test
    public void testCalculatePositiveSum() {
        int[] array = {1, 2, 3, 4, 5, -6, -7, -8, -9, -10};
        Assertions.assertEquals(15, Integer.calculate(array));
    }

    @Test
    public void testCalculateNegativeProduct() {
        int[] array = {-1, -2, -3, -4, -5, 6, 7, 8, 9, 10};
        Assertions.assertEquals(30240, Integer.calculate(array));
    }

    @Test
    public void testCalculateMixedValues() {
        int[] array = {1, 2, 3, -4, -5, -6, 7, 8, 9, -10};
        Assertions.assertEquals(30240, Integer.calculate(array));
    }

    @Test
    public void testCalculateZeroValues() {
        int[] array = {0, 0, 0, 0, 0, 1, 2, 3, 4, 5};
        Assertions.assertEquals(0, Integer.calculate(array));
    }
}
