package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAdd() {
        // Arrange
        int a = 5;
        int b = 7;
        int expected = 12;

        // Act
        int result = App.add(a, b);

        // Assert
        assertEquals(expected, result, "The addition result should be 12");
    }

    @Test
    public void testAddNegativeNumbers() {
        // Arrange
        int a = -5;
        int b = -7;
        int expected = -12;

        // Act
        int result = App.add(a, b);

        // Assert
        assertEquals(expected, result, "The addition result of negative numbers should be -12");
    }

    @Test
    public void testAddZero() {
        // Arrange
        int a = 0;
        int b = 7;
        int expected = 7;

        // Act
        int result = App.add(a, b);

        // Assert
        assertEquals(expected, result, "Adding zero should return the other number");
    }

    // Adding a failing test case
    @Test
    public void testFailure() {
        assertTrue(false);  // This will fail intentionally
    }
}
