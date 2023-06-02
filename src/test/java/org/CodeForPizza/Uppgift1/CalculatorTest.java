package org.CodeForPizza.Uppgift1;

import org.CodeForPizza.Uppgift1.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator sup = new Calculator();

    @Test
    @DisplayName("should return 3 if 1 + 2")
    void addShouldBe3() {
        //arrange
        int value1 = 1;
        int value2 = 2;
        int expected = 3;

        //act
        int actual = sup.add(value1, value2);

        //assert
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("should not return 3 if 1 + 2")
    void addShouldNotBe3() {
        //arrange
        int value1 = 1;
        int value2 = 2;
        int expected = 4;

        //act
        int actual = sup.add(value1, value2);

        //assert
        assertNotEquals(expected, actual);
    }

    @Test
    @DisplayName("should throw exception if negative input")
    void addIfNegativInput() {
        //arrange
        int value1 = 1;
        int value2 = -2;
        int expected = 3;

        //act & assert
        assertThrows(IllegalArgumentException.class, () -> {
            sup.add(value1, value2);
        });
    }


    @Test
    @DisplayName("should return 1 if 3 - 2")
    void subtractShouldbe1() {
        //arrange
        int value1 = 3;
        int value2 = 2;
        int expected = 1;

        //act
        int actual = sup.subtract(value1, value2);

        //assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should not return 1 if 5 - 2")
    void subtractNotBe1() {
        //arrange
        int value1 = 5;
        int value2 = 2;
        int expected = 1;

        //act
        int actual = sup.subtract(value1, value2);

        //assert
        assertNotEquals(expected, actual);
    }

    @Test
    @DisplayName("should throw exception if negative input")
    void subtractShouldNotBeNegative() {
        //arrange
        int value1 = -3;
        int value2 = 2;
        int expected = 1;


        //act & assert
        assertThrows(IllegalArgumentException.class, () -> sup.subtract(value1, value2));
    }

    @Test
    @DisplayName("should return 6 if 3 * 2")
    void multiplyShouldBe6() {
        //arrange
        int value1 = 3;
        int value2 = 2;
        int expected = 6;

        //act
        int actual = sup.multiply(value1, value2);

        //assert
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("should not return 6 if 5 * 2")
    void multiplyShouldNotBe6() {
        //arrange
        int value1 = 5;
        int value2 = 2;
        int expected = 6;

        //act
        int actual = sup.multiply(value1, value2);

        //assert
        assertNotEquals(expected, actual);

    }

    @Test
    @DisplayName("should throw exception if negative input")
    void multiplyShouldNotBeNegative() {
        //arrange
        int value1 = -3;
        int value2 = 2;
        int expected = 6;

        //act & assert
        assertThrows(IllegalArgumentException.class, () -> sup.multiply(value1, value2));

    }

    @Test
    @DisplayName("should return 3 if 6 / 2")
    void divideShouldBe3() {
        //arrange
        int value1 = 6;
        int value2 = 2;
        int expected = 3;

        //act
        int actual = sup.divide(value1, value2);

        //assert
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("should not return 3 if 8 / 2")
    void divideShouldNotBe3() {
        //arrange
        int value1 = 8;
        int value2 = 2;
        int expected = 3;

        //act
        int actual = sup.divide(value1, value2);

        //assert
        assertNotEquals(expected, actual);

    }

    @Test
    @DisplayName("should throw exception if divide by 0")
    void divideShouldNotBe0() {
        //arrange
        int value1 = 0;
        int value2 = 2;
        int expected = 3;


        //act & assert
        assertThrows(IllegalArgumentException.class, () -> sup.divide(value1, value2));

    }

    @Test
    @DisplayName("should throw exception if negative input")
    void divideShouldNotBeNegative() {
        //arrange
        int value1 = -6;
        int value2 = 2;
        int expected = 3;

        //act & assert
        assertThrows(IllegalArgumentException.class, () -> sup.divide(value1, value2));
    }

}