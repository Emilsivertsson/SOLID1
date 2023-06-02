package org.CodeForPizza.Uppgift2;

import org.CodeForPizza.Uppgift2.Circle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle sup = new Circle(0);

    @Test
    @DisplayName("calculateArea should be 78")
    void calculateAreaShouldBe78() {
        // Arrange
        int x = 5;
        double expected = 78.53981633974483;

        // Act
        double actual = sup.calculateArea(x);

        // Assert
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("calculateArea should not be 78")
    void calculateAreaShouldNoBe78() {
        // Arrange
        int x = 7;
        double expected = 78.53981633974483;

        // Act
        double actual = sup.calculateArea(x);

        // Assert
        assertNotEquals(expected, actual);

    }

    @Test
    @DisplayName("Radius/input should not be negative")
    void CalculateAreaRadiusNotNegative() {
        // Arrange
        int x = -5;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> sup.calculateArea(x));
    }
}