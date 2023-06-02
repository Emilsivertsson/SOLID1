package org.CodeForPizza.Uppgift3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void testMakeSound() {
        Dog dog = new Dog();
        assertEquals("Woof!", dog.makeSound());

    }

    @Test
    void testMakeSoundNotWoff() {
        Dog dog = new Dog();
        assertNotEquals("Meow!", dog.makeSound());

    }
}