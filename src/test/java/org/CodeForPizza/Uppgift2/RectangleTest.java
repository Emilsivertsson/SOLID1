package org.CodeForPizza.Uppgift2;

import org.CodeForPizza.Uppgift2.Rectangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle sup = new Rectangle(0,0);

    @Test
    @DisplayName("calculateArea should be 25")
    void calculateAreaShouldBe25() {
        //arrange
        int x = 5;
        int y = 5;
        int expected = 25;

        //act
        int actual = (int) sup.calculateArea(x, y);

        //assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("calculateArea should not be 25")
    void calculateAreaShouldNotBe25() {
        //arrange
        int x = 6;
        int y = 5;
        int expected = 25;

        //act
        int actual = (int) sup.calculateArea(x, y);

        //assert
        assertNotEquals(expected, actual);
    }

    @Test
    @DisplayName("calculateArea should not be zero")
    void calculateAreaShouldNotBeNegative() {
        //arrange
        int x = -5;
        int y = 5;
        int expected = 25;

        //act & assert
        assertThrows(IllegalArgumentException.class, () -> sup.calculateArea(x, y));
    }
}