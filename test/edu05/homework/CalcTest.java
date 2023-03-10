package edu05.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {
    Calc calc = new Calc();

    @Test
   public void testAdd() {
        assertTrue(calc.add(1,5) == 6);
    }

    @Test
   public void testDivPositive() {
        int actual = 4;
        int expected = calc.div(9, 2);
        assertEquals(actual, expected);
    }

    @Test //(expected = Exception.class)
    public void testDivZero() {
        int actual = calc.div(23, 0);}
}