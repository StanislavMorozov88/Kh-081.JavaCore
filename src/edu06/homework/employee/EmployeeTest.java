package edu06.homework.employee;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class EmployeeTest {
    @Test
    public void testGetName() {
        Employee employee = new Employee("John Doe", 30, 50000.00);
        assertEquals("John Doe", employee.getName());
    }

    @Test
    public void testGetAge() {
        Employee employee = new Employee("John Doe", 30, 50000.00);
        assertEquals(30, employee.getAge());
    }

    @Test
    public void testGetSalary() {
        Employee employee = new Employee("John Doe", 30, 50000.00);
        assertEquals(50000.00, employee.getSalary(), 0.001);
    }
}
