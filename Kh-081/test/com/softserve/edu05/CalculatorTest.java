package com.softserve.edu05;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    void add() {
        assertEquals(5, Calculator.add(2, 3));
    }
    @Test
    void addPositiveToNegative() {
        int result = Calculator.add(2, -3);
        assertEquals(-1, result);
    }


    @Test
    void subtract() {
        int result = Calculator.subtract(5, 4);
        assertEquals(1, result);
    }

    @Test
    void multiply() {
        int result = Calculator.multiply(5, 4);
        assertEquals(20, result);
    }

    @Test
    void divide() {
        int result = Calculator.divide(5, 4);
        assertEquals(1, result);
    }

    @Test
    void divideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.divide(6, 0);
        });
    }
}