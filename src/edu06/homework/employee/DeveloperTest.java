package edu06.homework.employee;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class DeveloperTest {
    @Test
    public void testGetPosition() {
        Developer developer = new Developer("Jane Smith", 25, 60000.00, "Senior Developer");
        assertEquals("Senior Developer", developer.getPosition());
    }

    @Test
    public void testSetPosition() {
        Developer developer = new Developer("Jane Smith", 25, 60000.00, "Senior Developer");
        developer.setPosition("Lead Developer");
        assertEquals("Lead Developer", developer.getPosition());
    }
}
