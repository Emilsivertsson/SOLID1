package org.CodeForPizza.Uppgift3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void testMakeSound() {
        Cat cat = new Cat();
        assertEquals("Meow!", cat.makeSound());

    }
    @Test
    void testMakeSoundNotMeow() {
        Cat cat = new Cat();
        assertNotEquals("Woff!", cat.makeSound());

    }
}