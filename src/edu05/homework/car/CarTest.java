package edu05.homework.car;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class CarTest {
    @Test
    public void testGetType() {
        Car car = new Car("Sedan", 2022, 2.5);
        assertEquals("Sedan", car.getType());
    }

    @Test
    public void testGetYear() {
        Car car = new Car("Sedan", 2022, 2.5);
        assertEquals(2022, car.getYear());
    }

    @Test
    public void testGetEngineCapacity() {
        Car car = new Car("Sedan", 2022, 2.5);
        assertEquals(2.5, car.getEngine_capacity(), 0.001);
    }

    @Test
    public void testToString() {
        Car car = new Car("Sedan", 2022, 2.5);
        assertEquals("Car -> type Sedan|, year 2022|, engine_capacity 2.5", car.toString());
    }
}
