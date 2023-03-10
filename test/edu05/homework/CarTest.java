package edu05.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    Car car = new Car("Testik", 2020,2.0);
    @Test
    public void testGetType() {
        assertTrue(car.getType() == "Testik");
    }

    @Test
    public void testGetYear() {
        assertEquals(car.getYear(),2020);
    }

    @Test
    public void testGetEngine() {
        assertFalse(car.getEngine() == 1.9);
    }

}